public class q136a {
    public static void main(String[] args) {
        int[] nums = {4, 4, 2, 2, 1};
        System.out.println(singlenumber(nums));

    }
    public static int singlenumber(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[0] = nums[0]^nums[1];
        }
        return nums[0];
    }
}
