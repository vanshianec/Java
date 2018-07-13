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
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<String> partyMembers = Arrays.stream(input.readLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        String command = input.readLine();
        while (!command.equals("Party!")) {
            String commandParams[] = command.split("\\s+");
            String action = commandParams[0];
            String wordCondition = commandParams[1];
            String attribute = commandParams[2];
            for (int i = 0; i < partyMembers.size(); i++) {
                String partyMember = partyMembers.get(i);

                Predicate<String> wordOperation = getWordOperation(wordCondition, attribute, partyMember);
                switch (action) {
                    case "Double":
                        if (wordOperation.test(partyMember)) {
                            partyMembers.add(i, partyMember);
                            i++;
                        }
                        break;
                    case "Remove":
                        if (wordOperation.test(partyMember)) {
                            partyMembers.remove(partyMember);
                            i--;
                        }
                }
            }
            command = input.readLine();
        }
        if (partyMembers.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.print(Arrays.toString(partyMembers.toArray()).replace("[", "").replace("]", ""));
            System.out.println(" are going to the party!");
        }
    }

    private static Predicate<String> getWordOperation(String wordCondition, String attribute, String partyMember) {
        switch (wordCondition) {
            case "StartsWith":
                return member -> partyMember.startsWith(attribute);
            case "EndsWith":
                return member -> partyMember.endsWith(attribute);
        }
        return member -> partyMember.length() == Integer.parseInt(attribute);
    }
}