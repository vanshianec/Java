import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

       Pattern pattern = Pattern.compile("[aeouiyAEOUIY]");
       Matcher matcher = pattern.matcher(input);

       int counter=0;
       while(matcher.find()){
           counter++;
       }
        System.out.printf("Vowels: %d",counter);


    }
}