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
      List<String> names = Arrays.stream(input.readLine().split(" ")).sorted().collect(Collectors.toList());
      HashSet<String> letters = new HashSet<>();

      Stream.of(input.readLine().split(" "))
              .map(letter -> letter.toUpperCase())
              .forEach(letter -> letters.add(letter));

      Optional<String> firstWord = names.stream()
              .filter(word -> {
                  for (String letter : letters) {
                      if(word.toUpperCase().charAt(0)==letter.charAt(0)){
                          return true;
                      }
                  }
                  return false;
              }).findFirst();
      System.out.println(firstWord.isPresent() ? firstWord.get() : "No match");





    }
}
