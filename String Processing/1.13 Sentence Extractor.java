import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([^!?.]+[!?.])");
        String keyWord =scanner.nextLine();
        String text = scanner.nextLine();
        List<String> matches = new ArrayList<>();
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            matches.add(matcher.group().trim());

        }
        Pattern keyWordMatch=Pattern.compile("\\b"+keyWord+"\\b");
        for (String match : matches) {
            Matcher keyWordMatcher=keyWordMatch.matcher(match);
            if(keyWordMatcher.find()){
                System.out.println(match);
            }
        }


    }
}