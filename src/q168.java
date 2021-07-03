public class q168 {
    public static void main(String[] args) {
        int n = 26*3;
        System.out.println(convertToTitle(n));
    }
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int mod = n % 26;
            mod = mod == 0 ? 26 : mod;
            sb.append((char) ('A' + mod - 1));
            n = (n - mod) / 26;
        }
        return sb.reverse().toString();
    }
}