package Assignment_4;
import java.util.Scanner;
import java.util.Random;
public class lottery {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Random x = new Random();
        int a = x.nextInt(10);
        System.out.println("Choose a no between 0-10");
        int b = num.nextInt();
        if (a == b){
            System.out.println("You won");
        }
        else{
            System.out.println("Try again");
        }
    }
}
