import java.util.Scanner;

public class ReverseAndDigit {
    public static void main() {
        System.out.print("Enter the Number : ");
        int n = new Scanner(System.in).nextInt();

        int var = n , rev = 0 , sum = 0 , cnt = 0;

        while(var > 0){
            rev = rev*10 + var%10;
            sum += var%10;
            cnt ++;
            var /= 10;
        }

        System.out.println("Reverse of number : " + rev);
        System.out.println("Sum of Digits : " + sum);
        System.out.println("Total Digits  : " + cnt);

    }
}