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
                .filter(arr -> (Arrays.stream(arr.split(" ")).filter(grade -> grade.equals("2")||grade.equals("3"))).toArray().length>=2)
                .forEach(student -> System.out.printf("%s %s%n",student.split(" ")[0],student.split(" ")[1]));
    }
}
