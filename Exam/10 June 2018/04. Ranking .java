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
        LinkedHashMap<String,String> contests = new LinkedHashMap<>();
        TreeMap<String,LinkedHashMap<String,Integer>> users = new TreeMap<>();
        LinkedHashMap<String,Integer> totalPoints = new LinkedHashMap<>();
        String contestInput = reader.readLine();
        while(!contestInput.equals("end of contests")){
            contests.put(contestInput.split(":")[0],contestInput.split(":")[1]);
            contestInput = reader.readLine();
        }
        String submissions = reader.readLine();
        while(!submissions.equals("end of submissions")){
            String contest=submissions.split("=>")[0];
            String password = submissions.split("=>")[1];
            String username = submissions.split("=>")[2];
            int points = Integer.parseInt(submissions.split("=>")[3]);
            if(contests.containsKey(contest)){
                if(contests.get(contest).equals(password)){
                    if(!users.containsKey(username)){
                        users.put(username,new LinkedHashMap<>());
                        users.get(username).put(contest,points);
                        totalPoints.put(username,points);
                    }
                    else{
                        if(!users.get(username).containsKey(contest)){
                            users.get(username).put(contest,points);
                            totalPoints.put(username,totalPoints.get(username)+points);
                        }
                        else{
                            if(users.get(username).get(contest)<points){
                                int addedPoints=points-users.get(username).get(contest);
                                users.get(username).put(contest,points);
                                totalPoints.put(username,totalPoints.get(username)+addedPoints);
                            }
                        }
                    }
                }
            }


            submissions =reader.readLine();
        }
        String winner=totalPoints.entrySet().stream().max((kv1,kv2)-> kv1.getValue().compareTo(kv2.getValue())).get().getKey();
        System.out.printf("Best candidate is %s with total %d points.%n",winner,totalPoints.get(winner));
        System.out.println("Ranking:");
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : users.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream().sorted((kv2,kv1)-> kv1.getValue().compareTo(kv2.getValue()))
                    .forEach(kv -> System.out.printf("#  %s -> %d%n",kv.getKey(),kv.getValue()));

        }


    }
}







