package dhanu.study.easy;

public class SSSSSTTPPQ {
    // Given Input,print the following input: “SSSSSTTPPQ” Output:“5S2T2P1Q”.
    // ABCD
    public static void main(String[] args) {
        System.out.println(getResult("ABCD"));
    }


    public static String getResult(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int sum = 0;
            for (int j = i; j < input.length(); j++) {
                if ( input.charAt(i) == input.charAt(j)){
                    sum += 1;
                }
                else {
                    i = j-1;
                    break;
                }
            }
            result.append(sum).append(letter);
        }
        return result.toString();
    }
}
