package dhanu.study;

public class LongestSubArray {
    /*
        Longest sub-array having sum k.
        Given an array arr[] of size n containing integers find the length of the
        longest sub-array having sum equal to the given value k.
    */
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(findLength(arr, 15));
    }

    public static int findLength(int[] numbers, int k) {
        //1,2,3,4,5,6 --> k = 6
        int longestLength = 0;
        if (numbers.length == 0) {
            return longestLength;
        }
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            int length = 0;
                for (int j = i; j < numbers.length; j++) {
                    sum += numbers[j];
                    length++;
                    if(sum > k){
                        break;
                    }
                    if (sum == k && length > longestLength) {
                        longestLength = length;
                        break;
                    }
                }

        }
        return longestLength;

    }
}
