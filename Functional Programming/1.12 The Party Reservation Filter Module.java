import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<String> invitedPeople = Arrays.stream(input.readLine().split(" ")).collect(Collectors.toList());
        List<String> filterModule = new ArrayList<>();
        String commands = input.readLine();
        while (!commands.equals("Print")) {
            String tokens[] = commands.split(";");
            String command = tokens[0];
            String filterType = tokens[1];
            String filterParameter = tokens[2];
            for (int i = 0; i < invitedPeople.size(); i++) {
                String member = invitedPeople.get(i);
                Predicate<String> condition = getCondition(filterType, filterParameter, member);
                switch (command) {
                    case "Add filter":
                        if (condition.test(member)) {
                            if (!filterModule.contains(member)) {
                                filterModule.add(member);
                            }
                        }
                        break;
                    case "Remove filter":
                        if (condition.test(member)) {
                            if (filterModule.contains(member)) {
                                filterModule.remove(member);
                            }
                        }
                        break;
                }
            }

            commands = input.readLine();
        }

        for (String member : invitedPeople) {
            if (!filterModule.contains(member)) {
                System.out.print(member + " ");
            }
        }

    }

    private static Predicate<String> getCondition(String filterType, String filterParameter, String member) {
        switch (filterType) {
            case "Starts with":
                return mem -> member.startsWith(filterParameter);
            case "Ends with":
                return mem -> member.endsWith(filterParameter);
            case "Contains":
                return mem -> member.contains(filterParameter);
        }
        return mem -> member.length() == Integer.parseInt(filterParameter);
    }
}
