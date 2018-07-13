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

        int [] bounds = Arrays.stream(input.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        Arrays.stream(input.readLine().split(" "))
                .filter(word -> word.length()>0)
                .mapToInt(Integer::parseInt)
                .filter(num -> num>=bounds[0]&&num<=bounds[1])
                .forEach(num -> System.out.print(num+" "));

    }
}
