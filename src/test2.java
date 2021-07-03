public class test2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));

    }

    public static String removeDuplicates(String s) {
        int index = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (index >= 0 && chars[index] == chars[i]) {
                index--;
            } else {
                index++;
                chars[index] = chars[i];
            }
        }
        return String.copyValueOf(chars, 0, index + 1);

    }
}
