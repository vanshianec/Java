import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) throws IOException {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

      Arrays.stream(input.readLine().split(" "))
              .map(Integer::parseInt)
              .distinct()
              .filter(num -> num>=10 && num<=20)
              .limit(2)
              .forEach(num -> System.out.print(num+" "));


    }
}
