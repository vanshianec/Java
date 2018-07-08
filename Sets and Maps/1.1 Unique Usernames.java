import java.util.Scanner;
import java.util.LinkedHashSet;
public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet();
        while(N-->0){
            String name = scanner.nextLine();
            usernames.add(name);
        }
        for (String username : usernames) {
            System.out.println(username);
        }


    }
}
