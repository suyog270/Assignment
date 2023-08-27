package Assignment_3;
import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner marks1 = new Scanner(System.in);
        System.out.println("Enter marks of Science");
        double science = marks1.nextDouble();

        Scanner marks2 = new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        double maths = marks2.nextDouble();

        Scanner marks3 = new Scanner(System.in);
        System.out.println("Enter marks of Computer");
        double computer = marks3.nextDouble();

        double per1 = (science/100)*100;
        double per2 = (maths/100)*100;
        double per3 = (computer/100)*100;

        double total_per= (per1+per2+per3)/3;

        System.out.println("Your Grade is: ");
        if (total_per>=90 && total_per<=100){
            System.out.println("A+");
        } else if (total_per<90 && total_per>=80) {
            System.out.println("A");
        } else if (total_per<80 && total_per>=70) {
            System.out.println("B+");
        } else if (total_per<70 && total_per>=60){
            System.out.println("B");
        } else if (total_per<60 && total_per>=50) {
            System.out.println("C+");
        } else if (total_per<50 && total_per>=40) {
            System.out.println("C");
        } else if (total_per<40) {
            System.out.println("NG");
        } else{
            System.out.println("Error");
        }
    }
}
