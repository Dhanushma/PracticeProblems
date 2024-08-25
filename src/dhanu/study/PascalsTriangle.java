package dhanu.study;

public class PascalsTriangle {
    // Return element from a Pascal Traingle - Given 5,2 as input return 2nd element from 5th row

    public static void main(String[] args) {
        System.out.println(getElement(2, 2));
    }
    public static int getElement(int n, int k){

        if(n == 0 && k ==0 ){
            return 1;
        }
        return fact(n) / (fact(k) * fact(n-k));
    }

    private static int fact(int n) {
        if ( n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
