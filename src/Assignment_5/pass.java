package Assignment_5;

import java.util.Scanner;
public class pass{
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        String password = "Sifal";
        Scanner scc = new Scanner(System.in);
        while(b<a){

            System.out.println("Enter password: ");
            String correctpassword = scc.next();

            if(correctpassword.equals(password)){
                System.out.println("Correct password");
                break;
            }else{
                System.out.println("Try Again");
                b++;
            }if(b==a){
                System.out.println("Try again later!");
            }

        }


    }
}
