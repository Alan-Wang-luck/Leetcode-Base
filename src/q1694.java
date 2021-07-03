public class q1694 {
    public static void main(String[] args) {
        String number = "1-23-45 6";
        System.out.println(reformatNumber(number));

    }
    public static String reformatNumber(String number){
        number = number.replace(" ", "").replace("-", "");
        int n = number.length();

        StringBuilder ans = new StringBuilder();

        int start = 0;
        while (start + 3 < n - 1) {
            ans.append(number.substring(start, start + 3));
            ans.append("-");
            start += 3;
        }

        if (start + 4 == n) {
            ans.append(number.substring(start, start + 2));
            ans.append("-");
            start += 2;
            ans.append(number.substring(start, start + 2));
        } else {
            ans.append(number.substring(start));
        }

        return ans.toString();

    }
}
