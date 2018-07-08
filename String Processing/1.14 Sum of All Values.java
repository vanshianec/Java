import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String keyText = input.readLine();
        Pattern keyPattern = Pattern.compile("^([A-Za-z_]+)\\d.*\\d([A-Za-z_]+)$");
        Matcher keyMatcher = keyPattern.matcher(keyText);

        String text = input.readLine();
        String startKey = "";
        String endKey = "";
        boolean foundKey = false;
        while (keyMatcher.find()) {
            startKey = keyMatcher.group(1);
            endKey = keyMatcher.group(2);
            foundKey = true;
        }
        if (!foundKey) {
            System.out.println("<p>A key is missing</p>");
            return;
        }
        Pattern textPattern = Pattern.compile(startKey + "(\\d*\\.*\\d*)" + endKey);
        Matcher textMatcher = textPattern.matcher(text);
        boolean foundMatch = false;
        HashSet<String> values = new HashSet<>();
        while (textMatcher.find()) {
            values.add(textMatcher.group(1));
            foundMatch = true;
        }
        if (!foundMatch) {
            System.out.println("<p>The total value is: <em>nothing</em></p>");
            return;
        }
        double result = 0;
        for (String value : values) {
            result += Double.parseDouble(value);
        }
        if (result % 1 == 0) {
            System.out.printf("<p>The total value is: <em>%d</em></p>", (int) result);
        } else {
            System.out.printf("<p>The total value is: <em>%.2f</em></p>",result);
        }


    }
}