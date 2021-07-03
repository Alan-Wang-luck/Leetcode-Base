import java.util.Arrays;

public class q1833 {
    public static void main(String[] args) {
        int[] costs = {10,6,8,7,7,8};
        int coins = 5;
        System.out.println(maxIceCream(costs, coins));

    }
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int i : costs){
            if(coins >=  i){
                coins -= i;
                count++;
            }
            else{
                return count;
            }
        }
        return count;

    }
}
