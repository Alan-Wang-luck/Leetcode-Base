public class test1 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder a = new StringBuilder();
        int step = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') {
                step--;
            }
            if (step > 0) {
                a.append(c);
            }
            if (c == '(') {
                step++;
            }
        }
        return a.toString();
    }
}
