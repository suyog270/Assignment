package Assignment_6;
import java.util.Scanner;
public class sliced_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = 0;
        String num = input.next();
        for (int i = 0 ; i < num.length(); i++){
            a+= num.charAt(i) - '0' ;
        }
        System.out.println(a);
    }
}
