public class BitwiseMultiplication {
    public static int multiply(int a, int b) {
        int result = 0;
        int multiplicand = a;
        int multiplier = b;

        boolean negativeResult = (a < 0) ^ (b < 0);

        long longMultiplicand = Math.abs((long) a);
        long longMultiplier = Math.abs((long) b);

        while (longMultiplier > 0) {
            if ((longMultiplier & 1) == 1) {
                result += longMultiplicand;
            }
            longMultiplicand <<= 1;
            longMultiplier >>= 1;
        }
        return negativeResult ? -result : result;
    }

    public static void main(String[] args) {
        // Sample Input 1: 6, 4
        int num1 = 6;
        int num2 = 4;
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2)); // Output: 24

        // Sample Input 2: -5, 3
        int num3 = -5;
        int num4 = 3;
        System.out.println(num3 + " * " + num4 + " = " + multiply(num3, num4)); // Output: -15
    }
}