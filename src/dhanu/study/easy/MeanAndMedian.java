package dhanu.study.easy;

import java.util.Arrays;

public class MeanAndMedian {
    // Given n size unsorted array, find its mean and median.

    public static void main(String[] args) {
        int[] input = new int[] {3,6,2,7,5,4,9};

        System.out.println(findMean(input));
        System.out.println(findMedian(input));
    }
    public static double findMean(int[] arr) {

        int result = 0;
        for (int num : arr) {
            result += num;
        }
        return (double) result / arr.length;
    }

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;

        return  length % 2 == 0 ?  (double) (arr[length/2] + arr[length/2 - 1]) / 2 : arr[length/2];
    }
}
