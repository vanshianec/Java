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

      OptionalDouble average = Arrays.stream(input.readLine().split(" "))
              .filter(num -> num.length() > 0)
              .mapToDouble(Double::parseDouble)
              .average();
      System.out.println(average.isPresent() ? String.format("%.2f",average.getAsDouble()): "No match");


    }
}
