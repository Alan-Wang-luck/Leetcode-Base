public class q7 {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));

    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        if(!(-Math.pow(2, 31) / 10 <= rev) || rev > Math.pow(2, 31)/10){
            return 0;
        }
        return rev;
    }

}
