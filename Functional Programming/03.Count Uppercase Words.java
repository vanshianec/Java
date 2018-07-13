import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) throws IOException  {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       String words[] =input.readLine().split(" ");

        Predicate<String> uppercase = word -> word.charAt(0)==word.toUpperCase().charAt(0);
        List<String> uppercaseWords = new ArrayList<>();
        for (String word : words) {
            if(uppercase.test(word)){
                uppercaseWords.add(word);
            }
        }
        System.out.println(uppercaseWords.size());
        for (String uppercaseWord : uppercaseWords) {
            System.out.println(uppercaseWord);
        }


    }
}