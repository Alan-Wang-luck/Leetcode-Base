import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q15 {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(a));

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n < 3){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return res;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int L = i+1;
            int R = n-1;
            while(L<R) {
                if (nums[i] + nums[L] + nums[R] == 0) {
                    List<Integer> a  = new ArrayList();
                    a.add(nums[i]);
                    a.add(nums[L]);
                    a.add(nums[R]);
                    res.add(a);
                    while (L < R && nums[ L]==nums[L + 1]){
                        L = L + 1;
                    }
                    while (L < R && nums[ R]==nums[R - 1]) {
                        R = R - 1;
                        L = L + 1;
                        R = R - 1;
                    }
                }
                else if(nums[i] + nums[L] + nums[R] > 0){
                    R = R - 1;
                }
                else{
                    L = L + 1;
                }
            }
        }

        return res;


    }
}
