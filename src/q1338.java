import java.util.*;

public class q1338 {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(arr));


    }
    public static int minSetSize(int[] arr){
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        Map dic = new HashMap();
        for(int i = 1; i < n; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            if(arr[i] != arr[i-1]){
                dic.put(arr[i], count);
                count = 0;
            }
        }
        Set key = dic.keySet();
        int[] a = new int[key.size()];
        int i = 0;
        for(Object o:key) {
            a[i] = (int) dic.get(o);
            i++;
        }
        Arrays.sort(a);
        int cnt = 0;
        for(int j = a.length-1; j >0; j--){
            n = n-a[j];
            cnt ++;
            if(n < arr.length/2){
                return cnt;
            }
        }
        return cnt;
    }


}
