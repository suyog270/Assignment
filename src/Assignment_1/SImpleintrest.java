package Assignment_1;
import java.util.Scanner;
public class SImpleintrest {
    public static void main (String[] args){

        Scanner pri = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int principle = pri.nextInt();

        Scanner rate = new Scanner(System.in);
        System.out.println("Enter the rate: ");
        double rates = rate.nextDouble();

        Scanner times = new Scanner(System.in);
        System.out.println("Enter the time: ");
        double time = times.nextDouble();

        double SI = (principle * rates * time)/ 100;

        System.out.println("The simple interest is " + SI);
    }
}
