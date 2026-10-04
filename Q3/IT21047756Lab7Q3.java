import java.util.Scanner;

public class IT21047756Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Repeat for 5 customers
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            // Get total bill amount
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            // Get payment mode
            System.out.print("Enter payment mode (C/O): ");
            char paymentMode = input.next().charAt(0);

            // Check whether payment mode is valid
            if (paymentMode == 'C' || paymentMode == 'c') {

                // Calculate 5% discount
                double discount = billAmount * 5 / 100;

                // Calculate amount to be paid
                double amountToPay = billAmount - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            }
            else if (paymentMode == 'O' || paymentMode == 'o') {

                // No discount for other payment methods
                double discount = 0;
                double amountToPay = billAmount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            }
            else {

                // Display error for invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}