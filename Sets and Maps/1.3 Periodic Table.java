import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Programming  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> elements = new TreeSet<>();
        int N = Integer.parseInt(scanner.nextLine());
        while(N-->0){
            String input[]=scanner.nextLine().split(" ");
            for (String element : input) {
                elements.add(element);
            }

        }
        for (String element : elements) {
            System.out.printf("%s ",element);
        }






    }
}
