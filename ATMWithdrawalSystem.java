import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance, withdraw;
        System.out.print("Enter account balance: ");
        balance = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        withdraw = sc.nextInt();

        if (withdraw % 100 == 0 && (balance - withdraw) >= 1000) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance = " + balance);
        }

        else{
            System.out.println("Withdrawal failed.");
            if (withdraw % 100 != 0) {
                System.out.println("Withdrawal amount must be a multiple of 100.");
            }
            if ((balance - withdraw) < 1000) {
                System.out.println("Minimum balance after withdrawal must be 1000.");
            }
        }
        sc.close();
    }
}