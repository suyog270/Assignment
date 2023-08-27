package Assignment_1;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner rad = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = rad.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("The area of circle is " + area);
    }
}
