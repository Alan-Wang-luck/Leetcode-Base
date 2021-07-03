import com.alibaba.fastjson.JSON;

public class q1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; int n = 3;
        System.out.println(JSON.toJSONString(shuffle(nums, n)));

    }
    public static int[] shuffle(int[] nums , int n){
        int[] first = new int[n];
        int[] second = new int[n];
        for(int i = 0; i < n; i++){
            first[i] = nums[i];
            second[i] = nums[i+n];
        }
        int[] newnums = new int[n*2];
        for(int i = 0; i < n; i++){
            newnums[2*i] = first[i];
            newnums[2*i+1] = second[i];
        }
        return newnums;


    }
}
