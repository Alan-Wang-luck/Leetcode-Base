import java.util.Arrays;

public class q136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singlenumber(nums));
        System.out.println(Integer.toBinaryString(-5));

    }
    public static int singlenumber(int[] nums){
        Arrays.sort(nums);
        int cnt = 0;
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        for(int i = 1; i< nums.length-1; i++){
            if(nums[i-1]!=nums[i]&&nums[i]!=nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length-1];
    }
}
