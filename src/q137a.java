public class q137a {
    public static void main(String[] args) {
        int[] nums = {1, 2,2 ,2, 3, 3, 3};
        System.out.println(singlenumber(nums));

    }

    public static int singlenumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & mask) != 0) {
                    cnt++;
                }
            }
            if (cnt % 3 != 0) {
                ret |= mask;
            }
        }
        return ret;

    }

}

