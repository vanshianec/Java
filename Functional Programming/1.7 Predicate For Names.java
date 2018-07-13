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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String []names = scanner.nextLine().split(" ");
        Predicate<String> requiredLength = name -> name.length()<=length;
        for (String name : names){
            if(requiredLength.test(name)){
                System.out.println(name);
            }
        }
    }
}