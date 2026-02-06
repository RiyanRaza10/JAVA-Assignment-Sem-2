import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;

        System.out.print("Enter item price: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        // total bill before discount
        double total = price * quantity;
        double discount = 0;

        //Applying Discount if any
        if (total >= 2000) {
            if (total >= 5000) {
                discount = total * 0.10;   // 10% discount
            } else {
                discount = total * 0.05;   // 5% discount
            }
        }

        // amount after discount
        double discountedAmount = total - discount;

        // 18% GST applying
        double gst = discountedAmount * 0.18;

        // final answer
        double finalAmount = discountedAmount + gst;

        System.out.println("\nTotal Bill = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("GST (18%) = " + gst);
        System.out.println("Final Payable Amount = " + finalAmount);

        sc.close();
    }
}