import java.math.BigDecimal;

public class test3 {
    public static void main(String[] args) {
        int[] temperature = {1, 2, 3};
        int[] a = dailyTemperatures(temperature);
        for (int i : dailyTemperatures(temperature)) {
            System.out.println(i);
        }



    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length - 1; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                res[i] = 0;
                if (temperatures[i] < temperatures[j]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;

    }
}

//try{
//
//        }catch(){
//
//        }finally{
//
//        }
