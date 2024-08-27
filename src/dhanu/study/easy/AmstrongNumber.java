package dhanu.study.easy;

public class AmstrongNumber {
    // Find if a given number is Armstrong number
    // -An Armstrong number of three digits is an integer such that
    // the sum of the cubes of its digits is equal to the number itself.
    // For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
    public static void main(String[] args) {
        System.out.println(isAmstrong(371));
    }

    public static boolean isAmstrong(int number){

        int sum = 0;
        int temp = number;
        int length = 0;

        while(temp > 0){
            temp = temp / 10;
            length ++;
        }

        temp = number;
        while ( temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp = temp / 10;
        }
        return number == sum;
    }
}
