package dhanu.study;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SecondLargestInArray {
    // write code to find second largest element in an array

    public static void main(String[] args) {
        int[] arr = {1, 8, 34, 85, 22, 9, 56};
        List<Integer> list = IntStream.of(arr)
                .boxed().toList();
        int result = list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(result);

        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] array){
        int largest = 0;
        int secondLargest = 0;

        for(int i : array){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }

            if( i != largest && i > secondLargest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }

}
