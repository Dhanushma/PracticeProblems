package dhanu.study.medium;

import java.util.*;

public class Dictionary {
// Given a string of letters and a dictionary, the function longestWord should
//     find the longest word or words in the dictionary that can be made from the letters
//     Input: letters = "oet", dictionary = {"to","toe","toes"}
//     Output: {"toe"}


    public static Set<String> longestWord(String letters, Set<String> dictionary) {

        Map<Character, Integer> letterMap = new HashMap<>();
        int longestLenth = 0;
        Set<String> resultSet = new HashSet<>();

        for(char c : letters.toCharArray()){
            letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
        }

        for(String word : dictionary) {
            if (canFormWord(letterMap, word)) {
                if (word.length() > longestLenth) {
                    longestLenth = word.length();
                    resultSet.clear();
                    resultSet.add(word);
                }

                else if( word.length() == longestLenth) {
                    resultSet.add(word);
                }
            }

        }
        return  resultSet;
    }

    private static boolean canFormWord(Map<Character, Integer> letterMap, String word) {

        Map<Character, Integer> wordMap = new HashMap<>();
        for(char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
           if (entry.getValue() > letterMap.getOrDefault(entry.getKey(), 0)) {
               return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        String letters = "oet";
        Set<String> dictionary = new HashSet<>(Arrays.asList("to", "toe", "toes"));

        // Find the longest words
        Set<String> result = longestWord(letters, dictionary);

        // Print the result
        System.out.println(result);
    }

}
