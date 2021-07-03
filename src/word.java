public class word {
    public static void main(String[] args) {
        String s = "Hello     world   as ";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        int cnt = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                cnt = 0;
            } else {
                cnt++;
            }
            index++;
        }
        return cnt;

    }
}
