import java.util.Scanner;

public class q374 {
    public static void main(String[] args) {


        boolean judge = false;
        int pick = 0;
        while (!judge) {
            System.out.println("请输入范围：");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                int n = in.nextInt();
                pick = (int) (n * Math.random());
                judge = true;
            } else {
                System.out.println("看不懂人话吗，傻逼");
                continue;
            }
        }
        int guess = 0;

        while (guess != pick) {
            System.out.println("请输入猜测值:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                guess = input.nextInt();
            } else {
                System.out.println("看不懂人话吗，傻逼");
                continue;
            }

            System.out.println(guess(guess, pick) > 0 ? "猜小了" : guess(guess, pick) < 0 ? "猜大了" : "nb");

            /*if(guess(guess, pick)==-1){
                System.out.println("猜大了");
            }
            else if(guess(guess, pick)==1){
                System.out.println("猜小了");
            }
            else{
                System.out.println("真不戳");
            }*/
        }

    }

    public static int guess(int n, int pick) {
        if (pick < n) {
            return -1;
        } else if (pick > n) {
            return 1;
        } else {
            return 0;
        }

    }
    /*public static int guessNumber() {
        System.out.println("请输入guess值：");
        int guess

    }*/
}
