import java.util.Scanner;

public class SwapXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();  // Sample: 50
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();  // Sample: 60

        System.out.println("Before swap: a=" + a + ", b=" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a=" + a + ", b=" + b);
    }
}