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
        String line = input.readLine();
        String[] usernames = line.split("[\\s\\/\\\\()]+");
        Pattern validUsernamePattern = Pattern.compile("\\b([A-Za-z]{1}[\\w]{2,24})\\b");
        List<String> validUsernames = new ArrayList<>();
        for (String username : usernames) {
            Matcher matcher = validUsernamePattern.matcher(username);
            while (matcher.find()) {
                validUsernames.add(matcher.group(1));
            }
        }
        int maxLength = 0;
        String bestFirstUsername = "";
        String bestSecondUsername = "";
        for (int i = 0; i < validUsernames.size() - 1; i++) {
            int currentLength = validUsernames.get(i).length() + validUsernames.get(i + 1).length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                bestFirstUsername = validUsernames.get(i);
                bestSecondUsername = validUsernames.get(i + 1);
            }
        }
        System.out.println(bestFirstUsername);
        System.out.println(bestSecondUsername);


    }
}