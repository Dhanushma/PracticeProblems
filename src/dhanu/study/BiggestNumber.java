package dhanu.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class BiggestNumber {
    // Arrange given numbers to form the biggest number.Input- List of numbers :
    // {1, 34, 3, 98, 9, 76, 45, 4} Output – 998764543431

    public static void main(String[] args) {
        int[] input = {1, 34, 3, 98, 9, 76, 45, 4};
        String[] in = Arrays.stream(input).mapToObj(Integer::toString).
                toArray(String[]::new);

        System.out.println(getBiggestNumber(in));
    }
    public static String getBiggestNumber(String[] arr) {
        //use comparator
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        };

        //using lambda
        Comparator<String> comp = (a, b) -> (a + b).compareTo(b + a);
        Arrays.sort(arr, comp.reversed());

        StringBuilder builder = new StringBuilder();
        for (String s : arr){
            builder.append(s);
        }

        return builder.toString();
    }
}
