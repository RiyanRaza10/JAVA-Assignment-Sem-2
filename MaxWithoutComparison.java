import java.util.Scanner;

public class MaxWithoutComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int diff = x - y;
        int sign = diff >> 31;
        int max = y ^ ((x ^ y) & sign);

        System.out.println("Maximum: " + max);
    }
}