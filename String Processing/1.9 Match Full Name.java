import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
        String input =scanner.nextLine();
        while(!input.equals("end")){
            Matcher matcher =  pattern.matcher(input);
            if(matcher.find()){
                System.out.println(matcher.group(0));
            }


            input=scanner.nextLine();
        }
    }
}