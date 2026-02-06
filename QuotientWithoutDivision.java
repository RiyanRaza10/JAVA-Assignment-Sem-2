import java.util.Scanner;

public class QuotientWithoutDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        sc.close();

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println("Output: " + quotient);
    }
}