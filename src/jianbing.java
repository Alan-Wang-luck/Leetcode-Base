import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jianbing {
    public static void main(String[] args) {
        int[] A = {3, 2, 4, 1};
        System.out.println(pancakeSort(A));

    }

    public static List<Integer> pancakeSort(int[] A) {
        if(A.length == 0 || A.length == 1){
            List<Integer> list1 = new ArrayList<>();
            for(int i: A){
                list1.add(i);
            }
            return list1;
        }
        int times = 0;
        List<Integer> list = new ArrayList<>();
        int[] B = Arrays.copyOf(A, A.length);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            times = findMax(A, B, i);
            if (times != -1) {
                if (times != 0) {
                    reverse(A, times);
                    list.add(times + 1);
                }
                //如果当前最大值位置等于0，就可以直接全部翻转

                reverse(A, A.length - i - 1);
                list.add(A.length - i);


            }
        }
        return list;

    }

    public static int findMax(int[] A, int[] B, int curr) {
        int num = B[B.length - curr - 1];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == num) {
                index = i;
                break;
            }

        }
        if (B.length - curr - 1 == index)
            return -1;

        return index;
    }

    public static int[] reverse(int[] A, int times) {
        for (int i = 0; i < (times + 1) / 2; i++) {
            int temp = A[i];
            A[i] = A[times - i];
            A[times - i] = temp;
        }
        return A;
    }
}
