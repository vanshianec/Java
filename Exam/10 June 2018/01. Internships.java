import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int problemsCount = Integer.parseInt(reader.readLine());
        int candidatesCount = Integer.parseInt(reader.readLine());
        int copy = candidatesCount;
        if (problemsCount == 0 || candidatesCount == 0) {
            System.out.println();
            return;
        }
        ArrayDeque<String> problems = new ArrayDeque<>();
        Queue<String> candidates = new LinkedList<>();
        while (problemsCount-- > 0) {
            String problem = reader.readLine();
            problems.push(problem);
        }
        Pattern validName = Pattern.compile("([A-Z][a-z]+\\s+[A-Z][a-z]+)");
        while (candidatesCount-- > 0) {
            String candidate = reader.readLine();
            Matcher matcher = validName.matcher(candidate);
            if (matcher.find()) {
                candidates.offer(candidate);
            }
        }
        while (true) {

            if (candidates.size() == 1) {
                if (copy == 1) {
                    String candidate = candidates.poll();
                    String problem = problems.pop();
                    int candidateSum = 0;
                    int problemSum = 0;
                    for (int i = 0; i < candidate.length(); i++) {
                        candidateSum += candidate.charAt(i);
                    }
                    for (int i = 0; i < problem.length(); i++) {
                        problemSum += problem.charAt(i);
                    }
                    if (candidateSum > problemSum) {
                        System.out.printf("%s gets the job!%n", candidate);

                    } else {
                        System.out.printf("%s failed %s.%n", candidate, problem);
                    }
                } else {
                    System.out.printf("%s gets the job!%n", candidates.poll());
                }
                break;

            } else if (problems.isEmpty()) {
                List<String> result = new ArrayList<>();
                while (!candidates.isEmpty()) {
                    result.add(candidates.poll());
                }
                System.out.println(String.join(", ", result));
                break;
            }
            String candidate = candidates.poll();
            String problem = problems.pop();
            int candidateSum = 0;
            int problemSum = 0;
            for (int i = 0; i < candidate.length(); i++) {
                candidateSum += candidate.charAt(i);
            }
            for (int i = 0; i < problem.length(); i++) {
                problemSum += problem.charAt(i);
            }
            if (candidateSum > problemSum) {
                System.out.printf("%s solved %s.%n", candidate, problem);
                candidates.offer(candidate);
            } else {
                System.out.printf("%s failed %s.%n", candidate, problem);
                problems.offer(problem);
            }


        }

    }

}







