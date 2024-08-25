package dhanu.study.easy;

public class FibanocciNumber {

    public static void main(String[] args) {
        System.out.println(getNumber(9));
        System.out.println(findFibanocci(9));
    }

    // Find the nth Number in fibonacci series using Iterative and Recursive Approach.

    public static int getNumber(int n) {
        int a = 0;
        int b = 1;
        int i = 2;
        int c = 0;
        while (i <= n) {

            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }

    public static int findFibanocci(int number) {
        if (number <= 1) {
            return number;
        }

        return findFibanocci(number - 2) + findFibanocci(number - 1);
    }
}
