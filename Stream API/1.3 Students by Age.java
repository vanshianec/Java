import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        LinkedHashSet<String> inputs = new LinkedHashSet<>();
        while(!input.equals("END")){
             inputs.add(input);
            input=reader.readLine();
        }
        inputs.stream()
                .filter(word -> word.length()>0)
                .filter(word -> Integer.parseInt(word.split(" ")[2])>=18 && Integer.parseInt(word.split(" ")[2])<=24)
                .forEach(System.out::println);
    }
}
