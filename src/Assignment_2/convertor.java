package Assignment_2;
import java.util.Scanner;
public class convertor {
    public static void main(String[] args) {
        double NPR , USD;
        Scanner npr = new Scanner(System.in);
        System.out.println("Enter NPR currency: ");
        NPR = npr.nextDouble();
        USD = NPR / 132.52;
        System.out.println("Currency in USD: " + USD);
    }
}
