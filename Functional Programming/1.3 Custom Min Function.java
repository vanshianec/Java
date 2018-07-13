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
    public static void main(String[] args)  {
     Scanner scanner = new Scanner(System.in);
     int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num -> Integer.parseInt(num)).toArray();
     Function<int[],Integer> smallestNumber= arr -> {
         int smallestNum=Integer.MAX_VALUE;
         for (int i : arr) {
            if(i<smallestNum){
                smallestNum=i;
            }
         }
         return smallestNum;
        };
        System.out.println(smallestNumber.apply(numbers));






    }
}