import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        List<String> usernames = new ArrayList<String>();
        while(!input.equals("END")){
            Pattern pattern = Pattern.compile("^[\\w+-]{3,16}$");
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                usernames.add("valid");
            }
            else{
                usernames.add("invalid");
            }
            input=scanner.nextLine();

        }
        if(usernames.contains("valid")){
            for (String username : usernames) {
                System.out.println(username);
            }
        }





    }
}