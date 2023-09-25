package Assignment_4;
import java.util.Scanner;
public class login_page {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        String username = "Deerwalk";
        String password = "Sifal";

        System.out.println("Enter username: ");
        String user = username.next()

        System.out.println("Enter password: ");
        String pass = username.nextLine();

        if (user.equals(username) && password.equals(pass)){
            System.out.println("Successfully logged in");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
