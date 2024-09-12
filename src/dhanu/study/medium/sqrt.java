package dhanu.study.medium;

public class sqrt {

    public static double squareRoot(double x) {
        int i = 1;
        while (true) {
            if (i * i == x) {
                return i;
            } else if (i * i > x) {
                return dec(x, i - 1, i);
            }
            i++;
        }
    }

    public static double dec(double n, double i, double j) {
        double mid = (i + j) / 2;
        double square = mid * mid;

        if (square == n || Math.abs(square - n) < 0.00001) {
            return mid;
        }

        else if (square < n) {
            return dec(n, mid, j);
        }

        else {
            return dec(n, i, mid);
        }
    }

    public static void main(String args[]) {
        double[] inputs = { 2, 4, 100 };
        double[] expected_values = { 1.41421, 2, 10 };
        double threshold = 0.001;
        for (int i = 0; i < inputs.length; i++) {
            if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
                System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i],
                        squareRoot(inputs[i]));
            }
        }
        System.out.println("All tests passed");
    }
}
