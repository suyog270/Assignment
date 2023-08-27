package Assignment_4;
import java.util.Random;
public class random_no_generator {
    public static void main(String[] args) {
        Random no = new Random();
        int x = no.nextInt(100);
        System.out.println("Random no generator from (0-100)");
        System.out.println(x);
    }
}
