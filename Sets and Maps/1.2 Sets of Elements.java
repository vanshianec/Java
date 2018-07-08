import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Programming  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []input= scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        LinkedHashSet<Integer> firstElements = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondElements = new LinkedHashSet<>();
        LinkedHashSet<Integer> sameElements = new LinkedHashSet<>();
        for (int i=0;i<N;i++){
            int element = Integer.parseInt(scanner.nextLine());
            firstElements.add(element);
        }
        for (int i=0;i<M;i++){
            int element = Integer.parseInt(scanner.nextLine());
            secondElements.add(element);
        }
        for (Integer firstElement : firstElements) {
            if(secondElements.contains(firstElement)){
                sameElements.add(firstElement);
            }
        }
        for (Integer element : sameElements) {
            System.out.print(element+" ");
        }





    }
}
