import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> number = new ArrayList<Integer>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i], val+1);

            }
            else{
                map.put(nums[i], 1);
                number.add(nums[i]);
            }
        }
        for(int num : nums){
            if (map.get(num) > n/2){
                return num;
            }
        }

        return 0;



    }

}


