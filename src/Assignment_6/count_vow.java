package Assignment_6;
import java.util.Scanner;
public class count_vow {
    public static void main(String[] args) {

        int vowel = 0;
        int consonant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String user = input.next();
        String check = user.toLowerCase();

        for ( int i= 0; i < check.length(); i++ ){
            char word = check.charAt(i);
            if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("The total vowel in the given word: " + vowel);
        System.out.println("The total consonant in the given word: " + consonant);
    }
}
