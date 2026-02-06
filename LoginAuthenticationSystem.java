import java.util.Scanner;

public class LoginAuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful.");
                loggedIn = true;
                break;
            }

            else {
                attempts++;
                System.out.println("Wrong username or password.");

                if (attempts < 3) {
                    System.out.println("Attempts left: " + (3 - attempts));
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Account locked. Too many wrong attempts.");
        }
        sc.close();
    }
}