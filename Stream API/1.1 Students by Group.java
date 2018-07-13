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
                .filter(word -> word.charAt(word.trim().length()-1)=='2')
                .map(word -> word.replace("2",""))
                .sorted((word1,word2)-> word1.split(" ")[0].compareTo(word2.split(" ")[0]))
                .forEach(System.out::println);
    }
}
