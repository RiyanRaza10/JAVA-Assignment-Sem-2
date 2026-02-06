import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPower = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(isPower ? "true" : "false");
    }
}