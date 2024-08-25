package dhanu.study;

import java.util.*;

public class AnagramList {
    // Set of anagrams of list of words.
    // The output should be words which are anagrams from the list should
    // be grouped together.
    public static void main(String[] args) {
        System.out.println(getAnagramList(Arrays.asList("eat","tea","tan","ate","nat","bat")));
    }

    public static List<List<String>> getAnagramList(List<String> list) {

        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!anagramMap.containsKey(sorted)) {

                anagramMap.put(sorted, new ArrayList<>());
            }
            anagramMap.get(sorted).add(s);

        }
        return new ArrayList<>(anagramMap.values());
    }
}