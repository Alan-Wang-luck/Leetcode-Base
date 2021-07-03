import java.util.ArrayList;
import java.util.Arrays;

public class q1561 {
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));

    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int nums = piles.length;
        int a = nums / 3;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += piles[nums - 2 * i];
        }
        return sum;

    }
}
