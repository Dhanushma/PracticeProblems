package dhanu.study.easy;

public class LastIndex {

    // Given a string str and a character x, find last index of x in str.

    public static void main(String[] args) {
        print("hello", 'l');
    }
    public static void print(String input, char a) {
        for (int i = input.length() -1 ; i >= 0; i--) {

            if(input.charAt(i) == a) {
                System.out.println(i);
                break;
            }
        }

    }
}
