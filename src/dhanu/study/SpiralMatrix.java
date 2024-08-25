package dhanu.study;


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {6, 9, 7}};
       print(input);

    }

    public static void print(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int m = arr.length;// number of rows
        int n = arr[0].length; // number of columns

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;


        /*
        1 2 3
        4 5 6
        7 8 9
        6 9 7
         */
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            for (int i = right; i >= left; i--) {
                list.add(arr[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                list.add(arr[i][left]);
            }
            left++;
        }

        System.out.println(list);
    }
}
