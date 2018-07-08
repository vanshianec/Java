import java.util.*;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,LinkedHashMap<String,Integer>> userLogs = new TreeMap<>();

        String input = scanner.nextLine();
        while(!input.equals("end")){
            String text[] = input.split("IP=");
            String ip=text[1].split(" ")[0];
            String user=input.split("user=")[1];
            if(!userLogs.containsKey(user)){

                userLogs.put(user,new LinkedHashMap<String,Integer>());
                userLogs.get(user).put(ip,1);
            }
            else{
                if(!userLogs.get(user).containsKey(ip)){
                    userLogs.get(user).put(ip,1);
                }

                else{
                   userLogs.get(user).put(ip,userLogs.get(user).get(ip)+1);
                }
            }


            input=scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : userLogs.entrySet()) {
            System.out.println(entry.getKey()+":");
            int size=entry.getValue().size();
            int counter=0;
            for (Map.Entry<String , Integer> innerEntry : entry.getValue().entrySet()) {
               counter++;
               if(counter==size){

                System.out.printf("%s => %d.%n",innerEntry.getKey(),innerEntry.getValue());
               }
               else{
                   System.out.printf("%s => %d, ",innerEntry.getKey(),innerEntry.getValue());
               }

            }
        }




    }

}
