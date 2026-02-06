import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("The number is Positive.");
        } else {
            System.out.println("The number is Negative.");
        }

        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7.");
        } else {
            System.out.println("The number is NOT divisible by both 5 and 7.");
        }

        sc.close();
    }
}