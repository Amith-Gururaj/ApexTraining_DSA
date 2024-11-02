public class PowerOfTen {

    public static boolean isPowerOfTen(int n) {
        if (n <= 0) return false;
        while (n % 10 == 0) {
            n /= 10;
        }
        return n == 1;
    }
}
