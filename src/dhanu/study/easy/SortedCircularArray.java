package dhanu.study.easy;

public class SortedCircularArray {
    //2nd smallest element of a sorted rotated array. E.g. 5,6,1,2,3,4
    public static void main(String[] args) {

    }

    public static int secondLargest(int[] arr) {

        //6123, 1236, 3612
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1 / arr.length]) {
                return arr[i + 2 / arr.length];
            }
        }
        return arr[1];
    }
}
