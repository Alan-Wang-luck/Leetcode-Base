import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * swap function
 */

public class q1528b {

    public static void main(String[] args) {
        List<String> vector = new ArrayList<String>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        System.out.println(JSON.toJSONString(vector));
        Collections.swap(vector, 0, 4);
        System.out.println(JSON.toJSONString(vector));
        char a = 'a';
        System.out.println(Character.isLowerCase(a));

    }
    public static String restoreString(String s, int[] indices){
        return "a";
    }
}
