import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class q22 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(JSON.toJSONString(generateParenthesis(n)));

    }
    public static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<String>();
        if(n == 0){
            return res;
        }
        dfs("",n, n, res);
        return res;


    }
    public static void dfs(String curStr, int left, int right, List<String> res){
        if(left == 0 && right ==0){
            res.add(curStr);
            return;
        }
        if(left > right){
            return;
        }
        if(right > 0){
            dfs(curStr+")", left, right-1, res);
        }
        if(left > 0){
            dfs(curStr+"(", left-1, right, res);
        }
    }
}
