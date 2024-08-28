package dhanu.study.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FormatString {
    // Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case.
    //It is a style of writing where we don’t have spaces and all words begin with capital letters.*/


    public static void main(String[] args) {
        print("hi you are beautiful");
    }
    public static void print(String input){

        String[] arr = input.split(" ");

        String out = Arrays.stream(arr).map(word -> word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining());
        System.out.println(out);
    }
}
