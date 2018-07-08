import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeMap;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Character, Integer> ocurrences = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!ocurrences.containsKey(input.charAt(i))) {
                ocurrences.put(input.charAt(i), 1);
            } else {
                ocurrences.put(input.charAt(i), ocurrences.get(input.charAt(i)) + 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : ocurrences.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }


    }
}
