package dhanu.study;

import java.util.ArrayList;
import java.util.List;

public class SmallestSubArray {
    // Find the smallest subarray whose sum is equal or greater than the target value
    // 5, 7, 12, 2, 4, 8 -> 14
    public static void main(String[] args) {
        //int[] a = {1, 4, 45, 6, 0, 19};
        int[] a = {1, 2, 4};
        System.out.println(smallestSubArray(a, 8));
    }

    public static List<Integer> smallestSubArray(int[] input, int k) {

        List<Integer> result = new ArrayList<>();
        int smallest = input.length;
        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < input.length; j++) {
                sum += input[j];
                list.add(input[j]);
                if (sum >= k && list.size() <= smallest) {
                    smallest = list.size();
                    result = list;
                    break;
                }

            }
        }
        return result;
        //return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
