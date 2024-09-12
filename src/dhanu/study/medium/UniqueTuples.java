package dhanu.study.medium;

import java.util.HashSet;

public class UniqueTuples {

    public static void main(String[] args) {
        System.out.println(getUnique("abbccde",2));

    }

    public static HashSet<String> getUnique(String input, int length) {

        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i <= input.length() - length; i ++){
            hashSet.add(input.substring(i, i + length));
        }
        return hashSet;
    }
}
