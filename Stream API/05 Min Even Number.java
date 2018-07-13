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

      OptionalDouble minEvenNumbers = Arrays.stream(input.readLine().split(" "))
              .filter(word -> word.length()>0)
              .mapToDouble(Double::parseDouble)
              .filter(num -> num % 2 == 0)
              .min();
       System.out.println(minEvenNumbers.isPresent() ? String.format("%.2f",minEvenNumbers.getAsDouble()) : "No match");



    }
}
