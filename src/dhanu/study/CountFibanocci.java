package dhanu.study;

import java.util.ArrayList;
import java.util.List;

public class CountFibanocci {
    //Count Fibonacci numbers in given range in O(Log n) time and O(1)
    //space.
    public static void main(String[] args) {
        System.out.println(getFibanocciList(0, 150));
    }

    public static List<Integer> getFibanocciList(int startRange, int endRange) {
        int a = 0;
        int b = 1;
        List<Integer> fibList = new ArrayList<>();
        if (a >= startRange && a <= endRange) {
            fibList.add(a);
        }
        if (b >= startRange && b <= endRange) {
            fibList.add(b);
        }
        for (int i = 2; ; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            if(b >= startRange && b <= endRange) {
                fibList.add(b);
            }
            else {
                break;
            }
        }
        return fibList;
    }

    public static int findCount(int start, int end){

        int a = 0;
        int b = 1;
        int c = 1;
        int count = 0;
        while (a <= end){
            if(a >= start){
                count ++;
                a = b;
                b = c;
                c  = a + b;
            }
        }
        return count;
    }
}
