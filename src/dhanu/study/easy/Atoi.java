package dhanu.study.easy;

public class Atoi {

    public static void main(String[] args) {
        System.out.println(toInteger("123"));
    }

    //Write a method for ATOI functionality (ASCII to Integer conversion

    public static int toInteger(String input){

        int res = 0;
        int sign = 1;
        int position = 0;

        if(input.charAt(0) == '-'){
            sign = -1;
            position ++;
        }

        for(; position < input.length(); position ++) {
            res = res * 10 + input.charAt(position) - '0';
        }
        return  res * sign;
    }
}
