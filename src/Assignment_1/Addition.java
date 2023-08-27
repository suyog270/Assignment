package Assignment_1;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int num1,num2, sum;

        Scanner add= new Scanner(System.in);
        System.out.println("Enter first no." );
        num1 = add.nextInt();
        System.out.println("Enter second no.");
        num2 = add.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is "+ sum);
    }
}
