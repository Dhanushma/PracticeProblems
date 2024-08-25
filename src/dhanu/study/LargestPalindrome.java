package dhanu.study;

public class LargestPalindrome {
    // Largest palindrome in a given string
    public static void main(String[] args) {
        System.out.println(largestPalindrome("forgeeksskeegfor"));
    }

    public static String largestPalindrome(String input){
        if(input.isEmpty()){
            return "";
        }
        String result = "";
        for(int i =0; i < input.length(); i++){

            for(int j = i+1; j < input.length(); j++){
                String sub = input.substring(i, j);
                if(isPalindrome(sub) && sub.length() > result.length()){
                    result = sub;
                }
            }
        }
        return result;

    }

    private static boolean isPalindrome(String input){

        String processed = input.replaceAll("^a-zA-Z0-1", "");

        int left = 0;
        int right = processed.length() - 1;

        while(left < right){
            if(processed.charAt(left) != processed.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
