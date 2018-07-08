import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.HashMap;
public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<String,String> phoneNumbers = new HashMap<>();
        while(!input.equals("search")){
            String personName = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            if(!phoneNumbers.containsKey(personName)){
                phoneNumbers.put(personName,phoneNumber);
            }
            else{
                phoneNumbers.put(personName,phoneNumber);
            }
            input=scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!input.equals("stop")){
            if(!phoneNumbers.containsKey(input)){
                System.out.printf("Contact %s does not exist.%n",input);
            }
            else{
                System.out.printf("%s -> %s%n",input,phoneNumbers.get(input));
            }


            input=scanner.nextLine();
        }


    }
}
