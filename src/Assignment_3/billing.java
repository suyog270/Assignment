package Assignment_3;
import java.util.Scanner;
public class billing {
    public static void main(String[] args) {
        System.out.println("         ***MENU***       ");
        System.out.println("SN  Items              Price");
        System.out.println("1)  MOMO................120");
        System.out.println("2)  PIZZA...............160");
        System.out.println("3)  BURGER..............130");
        Scanner items = new Scanner(System.in);

        System.out.println("Choose the SN of a item");
        int item = items.nextInt();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the amount of quantity");
        int quantity = number.nextInt();

        if (item == 1){
            int a = (quantity * 120);
            int sc = a + 50;
            System.out.println("total price: " + sc);
        } else if (item == 2) {
            int a = (quantity * 160);
            int sc = a + 50;
            System.out.println("total price: " + sc);
        } else if (item == 3) {
            int a = (quantity * 130);
            int sc = a + 50;
            System.out.println("total price: " + sc);
        }
        else{
            System.out.println("Enter a item from the menu");
        }
    }
}