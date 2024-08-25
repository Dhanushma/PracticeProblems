package dhanu.study;

import java.util.Stack;

public class ArrayStackable {
    public static void main(String[] args) {
       // int[] a = {4, 1, 2, 3};
        int[] a = {2, 3, 1};
        System.out.println(check(a, 3));
    }

    //{3,2,1}, {1,2,3}, {3, 2, 5}
    static boolean check(int[] arr, int n) {
        // Stack S
        Stack<Integer> stack = new Stack<>();
        int[] arr2 = new int[n];
        int begin = 0;

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if(stack.peek() < arr[i] && begin == 0){
                    arr[begin] = stack.pop();
                    stack.push(arr[i]);
                    begin ++;
                    continue;
                }
                if(stack.peek() < arr[i] && arr2[0] < stack.peek()){
                    arr[begin] = stack.pop();
                }
                if(stack.peek() < arr[i] && arr2[0] > stack.peek()){
                    return false;
                }
            }

        }
        return true;
    }
}
