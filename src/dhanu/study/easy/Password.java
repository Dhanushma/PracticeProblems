package dhanu.study.easy;


public class Password {

    public static void main(String[] args) {
        System.out.println(checkPasswordStrength("Gfg!@123"));
        System.out.println(checkPasswordStrengthUsingRegEx("Gfg!@122"));
    }

    public static String checkPasswordStrength(String input) {

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecialChars = false;
        String strength = "";

        for (char c : input.toCharArray()) {

            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if ("!@#$%^&*()".contains(String.valueOf(c))) {
                hasSpecialChars = true;
            }
        }

        int length = input.length();


        if (hasSpecialChars && hasDigit && hasLower && hasUpper && length >=8){
            return "Strong";
        }
        else if (hasLower && hasUpper && hasSpecialChars && length >= 6) {
            return "Moderate";
        }
        else
            return "Weak";
    }


    public static String checkPasswordStrengthUsingRegEx(String input) {

        /*String lowerCasePattern = "(?=.*[a-z])";
        String upperCasePattern = "(?=.*[A-Z])";
        String digitPattern = "(?=.*\\d)";
        String specialPattern = "(?=.*[!@#$%^&*()])";*/

        int length = input.length();


        boolean hasLower = input.matches(".*[a-z].*");
        boolean hasUpper = input.matches(".*[A-Z].*");
        boolean hasDigit = input.matches(".*[0-9].*");
        boolean hasSpecial = input.matches(".*[!@#$%^&*()].*");

        if (hasSpecial && hasDigit && hasLower && hasUpper && length >=8){
            return "Strong";
        }
        else if (hasLower && hasUpper && hasSpecial && length >= 6) {
            return "Moderate";
        }
        else
            return "Weak";

    }
}
