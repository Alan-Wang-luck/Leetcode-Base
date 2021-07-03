public class q171 {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(titleToNumber(s));

    }
    public static int titleToNumber(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }

}
