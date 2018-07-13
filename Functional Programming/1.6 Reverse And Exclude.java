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
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int divisor = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> divisible = num -> num % divisor == 0;
        for (int i=numbers.length-1;i>=0;i--){
            if(!divisible.test(numbers[i])){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}