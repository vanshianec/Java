import java.util.*;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,String> emails = new LinkedHashMap<>();
        String userName = scanner.nextLine();
        while(!userName.equals("stop")){
            String email = scanner.nextLine();
            if(!emails.containsKey(userName)){
                if(check(email)){
                    emails.put(userName,email);
                }
            }
            else{
                if(check(email)){
                    emails.put(userName,email);
                }
            }


            userName=scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }

    }
    private static boolean check(String email){
        switch(email.split("\\.")[1].toLowerCase()){
            case "com":
                return false;

            case "uk":
                return false;

            case "us":
                return false;

            default:
                return true;
        }

    }
}
