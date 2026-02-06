import java.util.Scanner;

public class MultiplyBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = (num << 3) - num;
        System.out.println(result);
    }
}