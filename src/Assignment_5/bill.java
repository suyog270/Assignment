package Assignment_5;
import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int item = bill.nextInt();
        bill.nextLine();
        double totalCost = 0;
        System.out.println("         ***MENU***       ");
        System.out.println("SN  Items              Price");
        System.out.println("1)  MOMO................120");

        for (int i = 1; i <= item; i++) {
            System.out.print("Enter name of item that you want " + i + ": ");
            String name = bill.nextLine();
            System.out.print("Enter quantity of " + name + ": ");
            int quantity = bill.nextInt();
            System.out.print("Enter the price of " + name + ": ");
            double price = bill.nextDouble();

            double Total = quantity * price;
            totalCost += Total;

            bill.nextLine();
        }

        double vat = totalCost * 0.13;
        double discount = totalCost * 0.10;
        double finalTotalCost = totalCost + vat - discount;

        System.out.println("----- Bill -----");
        System.out.println("Total Cost: " + totalCost + "RS");
        System.out.println("VAT (13%): " + vat + "RS");
        System.out.println("Discount (10%):" + discount + "RS");
        System.out.println("Final Total Cost:" + finalTotalCost + "RS");

    }
}