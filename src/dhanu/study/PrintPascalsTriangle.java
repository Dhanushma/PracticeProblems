package dhanu.study;

public class PrintPascalsTriangle {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-i ; j ++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact(j) * fact(i - j)) + " ");
            }
            System.out.println();

        }
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
