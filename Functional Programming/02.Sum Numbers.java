import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
       String numbers = input.nextLine();
        Function<String,Integer> getLength = line -> numbers.split(", ").length;
        System.out.println("Count = "+getLength.apply(numbers));
        Function<String,Integer> getSum = line -> {
            int[] arr = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
            int sum=0;
            for (int i : arr) {
                sum+=i;
            }
            return sum;
        };
        System.out.println("Sum = "+getSum.apply(numbers));



    }
}