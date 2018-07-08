import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(<a)\\s+href[^>]+(>)\\s*.+(<\\/a>)");
        String input =scanner.nextLine();
        StringBuilder str= new StringBuilder();
        while(!input.equals("END")){

            str.append(input);
            str.append("\n");
            input=scanner.nextLine();
        }
        String text=str.toString();
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String oldMatchedText=matcher.group(0);
            String matchedText=oldMatchedText;
            matchedText=matchedText.replaceFirst(matcher.group(1),"[URL");
            matchedText=matchedText.replaceFirst(matcher.group(2),"]");
            matchedText=matchedText.replaceFirst(matcher.group(3),"[/URL]");

            text=text.replace(oldMatchedText,matchedText);

        }
        System.out.println(text);
    }
}