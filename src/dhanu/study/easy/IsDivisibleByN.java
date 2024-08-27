package dhanu.study.easy;

import java.util.Arrays;
import java.util.List;

public class IsDivisibleByN {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50, 40, 90);
        System.out.println(isDivisible(list, 3));
    }

    public static boolean isDivisible(List<Integer> list, int num) {

        int reminder = 0;

        for(int i : list) {

            reminder = (reminder + i) % num;
        }

        return reminder == 0;
    }
}
