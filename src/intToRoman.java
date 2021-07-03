public class intToRoman {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String RoNums[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res = "";
        for (int i = 0; i < 13; ++i) {
            if (num <= 0) return res;
            while (num >= values[i]) {
                num -= values[i];
                res += RoNums[i];
            }
        }
        return res;
    }

}
//验证手机号的正则表达式

