package dhanu.study.medium;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public static void main(String[] args) {
        System.out.println(primefactorization(32));
    }

    public static List<Integer> primefactorization(int input) {
        List<Integer> list = new ArrayList<>();
        if (input < 2) {
            return list;
        }

        for (int i = 2; i < input; i++) {
            while(input % i == 0) {
                list.add(i);
                input = input / i;
            }
        }
        if (input > 2) {
            list.add(input);
        }

        return list;
        }
    }
