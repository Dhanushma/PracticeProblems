package dhanu.study.easy;

import java.util.Arrays;

public class MinAndMaxWord {

    // Program to find Smallest and Largest Word in a String.Input :
    // This is a test string Output : Minimum length word: is Maximum length word: string

    public static void main(String[] args) {
        printMinMax("This is a test string Output");
    }

    public static void printMinMax(String input) {

        String[] arr = input.split(" ");
        String min = "";
        String max = "";
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for (String word : arr) {

            if (word.length() > maxLength) {
                maxLength = word.length();
                max = word;
            }

            if (word.length() < minLength) {
                minLength = word.length();
                min = word;
            }
        }

        System.out.println("Min : " + min + ", Max : " + max);
    }
}
