import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> partyMembers = new TreeSet<>();
        String partyMember= scanner.nextLine();
        while(!partyMember.equals("PARTY")){
            partyMembers.add(partyMember);


            partyMember=scanner.nextLine();
        }
        partyMember=scanner.nextLine();
        while(!partyMember.equals("END")){
            if(partyMembers.contains(partyMember)){
                partyMembers.remove(partyMember);
            }

            partyMember=scanner.nextLine();
        }
        System.out.println(partyMembers.size());
        for (String member : partyMembers) {
            System.out.println(member);
        }


    }
}
