import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(JSON.toJSONString(letterCombinations(digits)));

    }
    public static List<String> letterCombinations(String digits){
        List<String> combinations = new ArrayList<String>();
        if(digits.length() == 0){
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        backtrack(combinations, phoneMap, digits, 0, new  StringBuffer());
        return combinations;
    }
    public static void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination){
        if(index == digits.length()){
            combinations.add(combination.toString());
        }else{
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int letterCount = letters.length();
            for(int i = 0; i < letterCount; i++){
                combination.append(letters.charAt(i));
                backtrack(combinations, phoneMap, digits, index+1, combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
