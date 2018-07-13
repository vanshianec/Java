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
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[],Integer> getSmallestElement = arr -> {
            int smallestNum = Integer.MAX_VALUE;
            int smallestNumIndex=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=smallestNum){
                    smallestNum=arr[i];
                    smallestNumIndex=i;
                }
            }
            return smallestNumIndex;
        };
        System.out.println(getSmallestElement.apply(numbers));
    }
}