package Assignment_2;
import java.util.Scanner;
public class Celc {
    public static void main(String[] args) {
        double celcius, fahrenheid;
        Scanner celc = new Scanner(System.in);
        System.out.println("Enter Celcius: ");
        celcius = celc.nextDouble();
        fahrenheid = (celcius * 9/5) + 32;
        System.out.println("Fahrenheid = " + fahrenheid);
    }
}
