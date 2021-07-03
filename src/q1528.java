import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class q1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

    }
    public static String restoreString(String s, int[] indices) {
        char[] schar = s.toCharArray();
        char[] res = new char[schar.length];
        int count = 0;
        for(int i : indices){
            res[i] = schar[count];
            count++;
        }
        String result  = "";
        for(char i :res){
            result += i;
        }
        return result;

    }
}
