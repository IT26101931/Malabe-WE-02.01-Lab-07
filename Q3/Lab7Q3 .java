import java.util.Scanner;

public class IT26101931Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char paymentMode = input.next().charAt(0);

            double discount = 0;
            double amountToPay;

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to be paid = " + amountToPay);

            }
            else if (paymentMode == 'O' || paymentMode == 'o') {

                amountToPay = bill;

                System.out.println("Discount = 0");
                System.out.println("Amount to be paid = " + amountToPay);

            }
            else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}