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
        while (!input.equals("END")) {
            inputs.add(input);
            input = reader.readLine();
        }
        inputs.stream()
                .filter(phone -> phone.length() > 0)
                .filter(phone -> phone.split(" ")[2].startsWith("02")|phone.split(" ")[2].startsWith("+3592"))
                .forEach(username -> System.out.printf("%s %s%n",username.split(" ")[0],username.split(" ")[1]) );


    }
}
