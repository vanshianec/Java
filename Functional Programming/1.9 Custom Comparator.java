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
        Integer[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (a, b) -> {
            if(a%2==0 && b%2!=0){
                return -1;
            }
            else if(a%2!=0 && b%2==0){
                return 1;
            }
            else{
                return a.compareTo(b);
            }
        };

        Arrays.sort(numbers,comparator);

        for (int num : numbers){
            System.out.print(num + " ");
        }

    }
}