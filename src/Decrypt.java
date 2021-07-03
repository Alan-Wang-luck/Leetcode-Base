import java.util.Scanner;
public class Decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后队员ID：");
        String in = sc.nextLine();
        String result = Decrypt(Integer.parseInt(in));
        System.out.println("加密前的队员ID：");
        System.out.println("CN"+result.substring(1,4)+
                "-"+result.substring(4,5)+"-"+result.substring(5));

    }
    public static String Decrypt(int number2){
        int[] arr = new int[9];
        int index = 0;
        while(number2 > 0){
            arr[index] = number2 % 10;
            index++;
            number2 /= 10;
        }
        for(int x = 0; x < index; x++){
            if(arr[x] >= 5){
                arr[x]-=5;
            }
            else {
                arr[x] += 5;
            }
        }
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;
        String s = "";
        for (int x = 0;x<index;x++){
            s += arr[x];
        }
        return s;
    }


}
