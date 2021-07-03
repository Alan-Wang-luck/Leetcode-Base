import java.util.HashSet;
import java.util.Set;

public class q3 {
    public static void main(String[] args) {
        String s = "abcabcabca";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = -1, ans = 0;
        for(int i = 0; i < n; i++){
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk-i+1);
        }
        return ans;
    }
}
