import java.util.Scanner;

public class SubWithoutOperators {
    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int negB = add(~b, 1);

        int result = add(a, negB);

        System.out.println(result);
    }
}