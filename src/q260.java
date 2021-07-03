

import com.alibaba.fastjson.JSON;

import java.util.Arrays;


public class q260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(JSON.toJSONString(singlenumber(nums)));

    }
    public static int[] singlenumber(int[] nums){
        Arrays.sort(nums);
        int cnt = 0;
        int[] res = new int[2];
        if(nums.length ==2){
            return nums;
        }
        if(nums[0]!=nums[1]){
            res[cnt] = nums[0];
            cnt++;
        }
        for(int i = 1; i< nums.length-1; i++){
            if(nums[i-1]!=nums[i]&&nums[i]!=nums[i+1]){
                res[cnt] = nums[i];
                cnt++;
            }

        }
        if(cnt!=2){
            res[1] = nums[nums.length-1];
        }
        return res;
    }
}
