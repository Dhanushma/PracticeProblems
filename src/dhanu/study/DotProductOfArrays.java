package dhanu.study;

import java.util.Arrays;

public class DotProductOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 6, 2};
        System.out.println(findProduct(a, b));
       // Arrays.stream(findProduct(a, b)).forEach(System.out::println);
    }

    public static int findProduct(int[] arr1, int[] arr2){
        int length = Math.min(arr1.length, arr2.length);
        //int[] prodArr = new int[length];
        int sum = 0;


        for(int i = 0; i < length; i++){
            sum += arr1[i] * arr2[i];
        }

        return sum;
    }
}
