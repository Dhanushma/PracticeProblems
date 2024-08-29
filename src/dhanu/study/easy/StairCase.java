package dhanu.study.easy;

public class StairCase {

    public static void main(String[] args) {
        printStairLeftCase(4);
        printStairRightCase(4);
    }

    public static void printStairLeftCase(int n) {

        for(int j = 1; j<= n; j++) {
            for(int i = 1; i<=n; i++) {

                if(i <= j) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void printStairRightCase(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j <= n-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
