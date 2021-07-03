public class q657 {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));

    }

    public static boolean judgeCircle(String moves) {
        int ud = 0;
        int lr = 0;
        int n = moves.length();
        for (int i = 0; i < n; i++) {
            String a = moves.substring(i, i+1);
            if(a.equals("U")){
                ud++;
            }
            else if(a.equals("D")){
                ud--;
            }
            else if(a.equals("L")){
                lr++;
            }
            else{
                lr--;
            }
        }
        return ud==0&&lr==0;
    }

}
