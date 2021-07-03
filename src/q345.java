public class q345 {
    public static void main(String[] args) {
        String a = "aaaaeeeee";
        System.out.println(reverse(a));

    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u' || c == 'A' ||
                c == 'O' || c == 'E' || c == 'I' || c == 'U';
    }
    public static String reverse(String s){
        int n = s.length();
        int left = 0, right = n-1;
        char[] sChar = s.toCharArray();
        while(left < right){
            char a = sChar[left];
            char b = sChar[right];
            if(!isVowel(a)){
                left++;
                continue;
            }
            else if(!isVowel(b)){
                right--;
                continue;
            }
            else{
                char c = sChar[left];
                sChar[left] = sChar[right];
                sChar[right] = c;
            }
            left++;
            right--;
        }
        return new String(sChar);
    }
}
