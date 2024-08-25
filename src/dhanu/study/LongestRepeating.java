package dhanu.study;

public class LongestRepeating {
    // Given a String “aabbbbddcc” find the longest first repeating index and its
    // length. (Input: “aabbbbddcc” Output: [2,4] 2 is the index and 4 is the length

    public static void main(String[] args) {
        getLongestRepeating("aabbbbddcc");
        getLongestRepeating("abcdefg");
        getLongestRepeating("");
        getLongestRepeating("aaaa");


    }

    public static void getLongestRepeating(String input) {

        if(input.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        int lengthMax = 1;
        int start = 0;

        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (check == input.charAt(j)) {
                    if (lengthMax < j - i + 1) {
                        lengthMax = j - i + 1;
                        start = i;
                    }
                } else {
                    i = j-1;
                    break;
                }
            }

        }
        //System.out.println(lengthMax);
        System.out.println(start + ", " + lengthMax);
    }
}
