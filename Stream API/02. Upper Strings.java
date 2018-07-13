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
              .map(word -> word.toUpperCase())
              .forEach(word -> System.out.print(word+" "));



    }
}
