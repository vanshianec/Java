import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(input.nextLine().split(", ")).map(e -> Integer.parseInt(e)).
                collect(Collectors.toList());
        numbers.removeIf(num -> num%2!=0);
        System.out.println(Arrays.toString(numbers.toArray()).replace("[","").replace("]",""));
        numbers.sort((a, b)-> a-b);
        System.out.println(Arrays.toString(numbers.toArray()).replace("[","").replace("]",""));




    }
}