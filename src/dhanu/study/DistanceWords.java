package dhanu.study;

import java.util.Objects;

public class DistanceWords {
    // Find the minimum distance between the given two words

    public static void main(String[] args) {
        String[] arr
                = {"the", "quick", "brown", "fox", "max" };

        String word1 = "the", word2 = "quick";
        System.out.println(distance(arr, word1, word2));
    }

    public static int distance(String[] input, String a, String b) {
        int posA = -1;
        int posB = -1;
        int result = input.length;

        for (int i = 0; i < input.length; i++) {

            if (Objects.equals(input[i], a)) {
                posA = i;
            }
            if (Objects.equals(input[i], b)) {
                posB = i;
            }

            if (posA != -1 && posB != -1 && result > Math.abs(posA - posB)) {
                result = Math.abs(posA - posB);
            }
        }
        return result;
    }
}
