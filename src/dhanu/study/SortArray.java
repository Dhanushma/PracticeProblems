package dhanu.study;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {7, 5, 12, 3, 9};
        System.out.println(secondSmallest(array));
    }

    public static int secondSmallest(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
}
