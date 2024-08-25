package dhanu.study.easy;

import java.util.HashMap;
import java.util.Map;

public class PairInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;

        System.out.println(count(arr, sum));
    }
    public static int count(int[] array, int sum) {

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int num : array) {
            if(map.containsKey(sum - num)){
                count += map.get(sum - num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    return count;
    }
}
