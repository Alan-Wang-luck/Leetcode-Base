public class q292 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(canWinNim(n));


    }
    public static boolean canWinNim(int n){
        if(n%4==0){
            return false;
        }
        return true;
    }
}
