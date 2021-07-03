import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class q401 {
    public static void main(String[] args) {
        int turnedOn = 1;
        System.out.println(JSON.toJSONString(readBinarySearch(turnedOn)));

    }
    public static List<String> readBinarySearch(int turnedOn){
        List<String> ans = new ArrayList<String>();
        for(int h = 0; h < 12; h++){
            for(int m = 0; m < 60; m++){
                if(Integer.bitCount(h)+Integer.bitCount(m) == turnedOn){
                    ans.add(h+":" + (m < 10 ? "0":"") + m);

                }
            }
        }
        return ans;
    }
}
