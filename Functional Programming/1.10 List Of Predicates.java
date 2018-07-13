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
        int N = Integer.parseInt(scanner.nextLine());
        int [] divisors = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Predicate<Integer> divisible = num -> {
            boolean div = true;
            for (int divisor : divisors){
                if(num%divisor!=0){
                    div=false;
                    break;
                }
            }
            return div;
        };
        for (int i=1;i<=N;i++){
            if(divisible.test(i)){
                System.out.print(i+" ");
            }
        }
    }
}