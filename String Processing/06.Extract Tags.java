import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        while(!input.equals("END")){
            Pattern pattern = Pattern.compile("<.+?>");
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                System.out.println(matcher.group(0));
            }
            input=scanner.nextLine();

        }





    }
}