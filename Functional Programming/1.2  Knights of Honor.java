import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args)throws IOException   {
     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
     String words[]= input.readLine().split("\\s+");
     Consumer<String> printWord = word -> System.out.println("Sir "+word);
        for (String word : words) {
            printWord.accept(word);
        }





    }
}