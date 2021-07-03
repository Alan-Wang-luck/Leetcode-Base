import com.alibaba.fastjson.JSON;

import java.util.Arrays;


public class q1 {


    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(JSON.toJSONString(twoSum(nums, target)));



    }
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
//        Arrays.sort(nums); 不能排序，因为这样之后出现的first和second和sort之前的first和second不同
        int n = nums.length;
        for(int first = 0; first < n; first++){
            int newtarget = target - nums[first];
            for(int second = first+1; second < n; second++){
                if(nums[second] == newtarget){
                    ans[0] = first;
                    ans[1] = second;
                    return ans;
                }
            }
        }
        return ans;
    }
}
