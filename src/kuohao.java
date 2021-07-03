public class kuohao {
    public static void main(String[] args) {
        String a = "()[]{}";
        System.out.println(isValid(a));

    }

    public static boolean isValid(String s) {
        int len = s.length() / 2;
        for (int i = 0; i < len; i++) {
            s = s.replace("()", "").replace("{}", "")
                    .replace("[]", "");
            if(s.length()==0){
                return true;
            }


        }
        return s.length() == 0;
    }
}
