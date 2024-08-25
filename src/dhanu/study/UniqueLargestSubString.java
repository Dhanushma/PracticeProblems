package dhanu.study;

public class UniqueLargestSubString {
    public static void main(String[] args) {
        //Largest substring with unique characters e.g. aaabcbdeaf Output : cbdeaf
        System.out.println(getUnique("aaabcbdeaf"));
    }

    public static String getUnique(String input) {
        if (input.isEmpty()) {
            return "";
        }
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            String sub = "";

            for (int j = i; j < input.length(); j++) {
                if (!sub.isEmpty() && sub.contains(String.valueOf(input.charAt(j)))) {
                    break;
                } else {
                    sub = input.substring(i, j+1);
                    if (sub.length() > result.length()) {
                        result = sub;
                    }
                }
            }
        }
        return result;
    }
}
