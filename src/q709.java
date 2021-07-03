public class q709 {
    public static void main(String[] args) {
        String s = "sdfghhfdcvjdsghvdcSSHHD";
        System.out.print(toLowerCase(s));


    }
    public static String toLowerCase(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
            else if(array[i] >= 'a' && array[i] <= 'z'){
                array[i] -= 32;
            }
        }
        return new String(array);


    }
}
