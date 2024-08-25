package dhanu.study.easy;

public class Panagram {
    //Missing characters to make a string Pangram

    public static void main(String[] args) {
        System.out.println(isPanagram("welcome to geeksforgeeks"));
    }

    public static boolean isPanagram(String input) {

        String inputInLowerCase = input.toLowerCase();
        StringBuilder missingChars = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!inputInLowerCase.contains(String.valueOf(c))) {
                missingChars.append(c);
            }
        }

        System.out.println(missingChars);

        return !missingChars.isEmpty();
    }
}
