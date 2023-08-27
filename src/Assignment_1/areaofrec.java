package Assignment_1;
import java.util.Scanner;
public class areaofrec {
    public static void main(String[] args) {

        int length, breadth, area;
        Scanner l= new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        System.out.println("Enter length of the rectangle: ");
        length= l.nextInt();

        System.out.println("Enter breadth of the rectangle");
        breadth = b.nextInt();

        area = length*breadth;
        System.out.println(area);
    }
}
