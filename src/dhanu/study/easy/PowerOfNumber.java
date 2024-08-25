package dhanu.study.easy;

public class PowerOfNumber {
    // Check if a number is a power of another number

    public static void main(String[] args) {
        System.out.println(isPower(27, 729));
    }
    public static boolean isPower(int x, int y) {

        while (y > 1 && y % x == 0) {
            y = y / x;
        }
        return y == 1;
    }
}
