import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(\\s|^)([a-z0-9]+([._-][a-z0-9]+)*@[a-z]+[-.]*[a-z]+\\.[a-z]+[.-]*[a-z]+)($| |,|.)");
        String input =scanner.nextLine();
        StringBuilder text = new StringBuilder();
        while(!input.equals("end")){
            text.append(input);
            text.append("\n");
            input=scanner.nextLine();

        }
        String extractEmails=text.toString();
        Matcher matcher = pattern.matcher(extractEmails);
        while(matcher.find()){

            System.out.println(matcher.group(2).trim());
        }
    }
}