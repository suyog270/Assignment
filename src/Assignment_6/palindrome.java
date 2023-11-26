package Assignment_6;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        String check = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        String num = input.next();
        int length = num.length() - 1;

        for ( int i = length; i>=0; i--){
            char num1 = num.charAt(i);
            check = check + num1;
        }
        if (check.equals(num)){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number isn't palindrome");
        }
    }
}
