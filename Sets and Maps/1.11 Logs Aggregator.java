import java.util.*;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,Integer> userTimeSpentLogged = new TreeMap<>();
        TreeMap<String,TreeSet<String>> userIpsStory = new TreeMap<>();
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        while(numberOfLines-->0){
        String userStats = scanner.nextLine();
         String ip=userStats.split(" ")[0];
         String user = userStats.split(" ")[1];
         int timeSpent = Integer.parseInt(userStats.split(" ")[2]);

         if(!userTimeSpentLogged.containsKey(user)){
             userTimeSpentLogged.put(user,timeSpent);
             userIpsStory.put(user,new TreeSet<>());
             userIpsStory.get(user).add(ip);
         }
         else{
             userTimeSpentLogged.put(user,userTimeSpentLogged.get(user)+timeSpent);
             userIpsStory.get(user).add(ip);
         }


        }

        for (Map.Entry<String,Integer> entry : userTimeSpentLogged.entrySet()) {
            System.out.printf("%s: %d ",entry.getKey(),entry.getValue());
            TreeSet<String> ips = new TreeSet<>();
            ips=userIpsStory.get(entry.getKey());
            System.out.print(Arrays.toString(ips.toArray()));
            System.out.println();
        }




    }

}
