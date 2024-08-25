package dhanu.study;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWords {
    public static void main(String[] args) {
        //Reverse individual words. Given a string str, we need to print reverse of individual words.
        System.out.println(getReverse("Hello My Name is Alam"));
    }

    public static String getReverse(String input) {
        String result = new StringBuilder(input).reverse().toString();


        // or
        String res = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());


        //reverse each word
        String reversedResult = Arrays.stream(input.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                /*.map(s -> {
            String reverse = "";
            char[] ws = s.toCharArray();
            for (int i = ws.length - 1; i >= 0; i--) {
                reverse = reverse + ws[i];
            }
            return reverse;
        })*/
                .collect(Collectors.joining(" "));

        System.out.println("Printing using java 8");
        System.out.println(res);
        System.out.println(reversedResult);

        System.out.println("Printing using String reverse");

        return result;
    }
}
