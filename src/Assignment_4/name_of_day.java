package Assignment_4;
import java.util.Scanner;
public class name_of_day {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter the no. of day");
        int no_of_day = no.nextInt();
        if (no_of_day == 1){
            System.out.println("Sunday");
        } else if (no_of_day == 2) {
            System.out.println("Monday");
        } else if (no_of_day == 3) {
            System.out.println("Tuesday");
        } else if (no_of_day == 4) {
            System.out.println("Wednesday");
        } else if (no_of_day == 5) {
            System.out.println("Thrusday");
        } else if (no_of_day == 6) {
            System.out.println("Friday");
        } else if (no_of_day == 7) {
            System.out.println("Saturday");
        }
    }
}
