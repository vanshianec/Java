import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        OptionalInt sumOfIntegers = Arrays.stream(input.readLine().split(" "))
                .filter(word -> word.length() > 0)
                .filter(num -> {
                    try {
                        Integer.parseInt(num);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }).mapToInt(Integer::parseInt)
                .reduce((x, y)-> x + y);
         System.out.println(sumOfIntegers.isPresent()? String.format("%d",sumOfIntegers.getAsInt()): "No match");

    }
}
