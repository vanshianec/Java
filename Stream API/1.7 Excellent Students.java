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
                .filter(studentGrades -> studentGrades.length() > 0)
                .filter(studentGrades -> studentGrades.contains("6")

                )
                .forEach(username -> System.out.printf("%s %s%n",username.split(" ")[0],username.split(" ")[1]) );


    }
}
