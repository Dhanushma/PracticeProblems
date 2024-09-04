package dhanu.study.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformString {

    /**
     * e.g.
     * for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
     */

    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input) {
        int longestStart = -1;
        int longestLength = 0;

        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (check == input.charAt(j)) {
                    if (longestLength < j - i + 1) {
                        longestLength = j - i + 1;
                        longestStart = i;
                    }
                } else {
                    i = j-1;
                    break;
                }
            }

        }

        // your code goes here
        return new int[]{longestStart, longestLength};
    }

    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for (Map.Entry<String, int[]> testCase : testCases.entrySet()) {
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if (pass) {
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}
