package dhanu.study.medium;

public class Power {

    /* Given base and integer exponent, compute value of base raised to the power of exponent.
     * Can you implement a solution faster than O(exp)?
     */
    public static double power(double base, int exp) {

        if (exp == 0) {
            return 1;
        }
        double res = 1.0;
        while(exp > 0){
            res *= base;
            exp --;
        }
        System.out.println(res);
        return res;
    }

    /* returns true if all tests pass, false otherwise */
    public static boolean doTestsPass() {
        double result = power(2.0,3);
        return  result == 8.0;
    }

    public static void main( String[] args ) {
        if (doTestsPass())
            System.out.println("All Tests Pass");
        else
            System.out.println("There are test failures");
    }
}
