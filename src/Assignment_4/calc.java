package Assignment_4;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter first no.");
        int num1 = calc.nextInt();
        System.out.println("Enter Second no.");
        int num2 = calc.nextInt();
        System.out.println("Enter the operator (+, -, *, /)");
        char operator = calc.next().charAt(0);

        if (operator == '+') {
            int result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            int result = num1-num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            int result = num1*num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            int result = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}