package Assignment_4;
import java.util.Scanner;
public class greater_3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int num1 = number.nextInt();

        System.out.println("Enter second no: ");
        int num2 = number.nextInt();

        System.out.println("Enter third no: ");
        int num3 = number.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is greatest");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is greatest");
        } else{
            System.out.println(num3 + " is greatest");
        }
    }
}
