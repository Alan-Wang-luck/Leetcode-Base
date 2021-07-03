import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
//摩尔投票法
public class q229 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3, 3, 3};
        System.out.println(JSON.toJSONString(majorityElement(nums)));

    }
    public static List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<Integer>();
        if(nums == null || nums.length == 0){
            return res;
        }
        int cand1 = nums[0], cnt1 = 0, cnta = 0;
        int cand2 = nums[0], cnt2 = 0, cntb = 0;
        for( int num: nums){
            if(cand1 == num){
                cnt1++;
                cnta++;
                continue;
            }
            if(cand2 == num){
                cnt2 ++;
                cntb++;
                continue;
            }
            if(cnt1 == 0){
                cand1 = num;
                cnt1++;
                continue;
            }
            if(cnt2 == 0){
                cand2 = num;
                cnt2++;
                continue;
            }
            cnt1--;
            cnt2--;
        }
//        cnt1 = 0;
//        cnt2 = 0;
//        for(int num: nums){
//            if(num == cand1){
//                cnt1++;
//            }
//            else if(num == cand2){
//                cnt2++;
//            }
//        }

        if(cnta > nums.length/3){
            res.add(cand1);
        }
        if(cntb > nums.length/3){
            res.add(cand2);
        }
        return res;

    }
}
