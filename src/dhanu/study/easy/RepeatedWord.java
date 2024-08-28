package dhanu.study.easy;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {

    // Find the first repeated word in a string. Input
    // : "Ravi had been saying that he had been there" .Output : had

    public static void main(String[] args) {
        System.out.println(findRepeated("Ravi had been saying that he had been there"));
    }

    public static String findRepeated(String input) {

        String[] arr = input.split(" ");
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        for (String word : arr) {
            if (map.containsKey(word)) {
                result = word;
                break;
            } else {
                map.put(word, 1);
            }
        }
        return result;
    }

}
