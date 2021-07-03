public class q204 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if(isPrime(i)){
                ans++;
            }
        }
        return ans;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
