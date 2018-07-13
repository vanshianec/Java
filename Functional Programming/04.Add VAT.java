import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args)   {
       Scanner scanner = new Scanner(System.in);
       double numbers[]=Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();
        UnaryOperator<Double> addVat = number -> number*1.2;
        System.out.println("Prices with VAT:");
        for (double number : numbers) {
              number=addVat.apply(number);
            System.out.printf("%.2f%n",number);
        }




    }
}