import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = Arrays.stream(numbers).map(num -> num + 1).toArray();
                    break;
                case "subtract":
                    numbers = Arrays.stream(numbers).map(num -> num - 1).toArray();
                    break;
                case "multiply":
                    numbers = Arrays.stream(numbers).map(num -> num * 2).toArray();
                    break;
                case "print":
                    for (int num : numbers) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

            }

            command = scanner.nextLine();
        }
    }
}