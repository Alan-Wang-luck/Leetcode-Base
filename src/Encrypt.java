import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入队员ID：");
        String in = sc.nextLine();
        String inn = "1"+in.substring(2,5)+in.substring(6,7)+in.substring(8,12);
        int number2 =  Integer.valueOf(inn).intValue();
        String result = Encrypt(number2);
        System.out.println("加密后的队员ID："+result);
    }
    //字符串类型
    public static String Encrypt(int number2){
        int []arr = new int[9];
        int index = 0;
        while (number2 > 0) {
            arr[index] = number2 % 10;
            index++;
            number2 /= 10;
        }
        for (int x = 0; x < index; x++) {
            arr[x] += 5;
            arr[x] %= 10;
        }
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        //把数组元素拼接成字符串返回
        //定义一个空字符串
        String s = "";
        for (int x = 0;x<index;x++){
            s += arr[x];
        }
        return s;
    }
}


