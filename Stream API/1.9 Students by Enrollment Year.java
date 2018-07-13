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
                .filter(student -> student.split(" ")[0].charAt(4)=='1'&&(student.split(" ")[0].charAt(5)=='4'||
                student.split(" ")[0].charAt(5)=='5'))
                .forEach(studendGrades -> {
                    String[] grades = studendGrades.split(" ");
                    for (int i=1;i<grades.length;i++){
                        System.out.print(grades[i]+" ");
                    }
                        System.out.println();
                });

    }
}
