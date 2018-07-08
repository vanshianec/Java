import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class VoinaNumberGame {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] firstInputLine= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     int[] secondInputLine= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     LinkedHashSet<Integer> firstPlayerCards=new LinkedHashSet<Integer>();
     LinkedHashSet<Integer> secondPlayerCards=new LinkedHashSet<Integer>();
        fillHashSet(firstInputLine, secondInputLine, firstPlayerCards, secondPlayerCards);
        int rounds=50;
     while(rounds>0){
         if(firstPlayerCards.isEmpty()||secondPlayerCards.isEmpty()){
             System.out.println(firstPlayerCards.isEmpty() ? "Second player win!" : "First player win!");
             return;
         }
         int firstNum=firstPlayerCards.iterator().next();
         firstPlayerCards.remove(firstNum);
         int secondNum=secondPlayerCards.iterator().next();
         secondPlayerCards.remove(secondNum);

         if(firstNum>secondNum){
             firstPlayerCards.add(firstNum);
             firstPlayerCards.add(secondNum);
         }
         else if(secondNum>firstNum){
             secondPlayerCards.add(firstNum);
             secondPlayerCards.add(secondNum);
         }
         rounds--;
     }
     printWinner(firstPlayerCards,secondPlayerCards);




    }

    private static void fillHashSet(int[] firstInputLine, int[] secondInputLine,
                                    LinkedHashSet<Integer> firstPlayerCards,
                                    LinkedHashSet<Integer> secondPlayerCards) {
        for(int i=0;i<firstInputLine.length;i++){
            firstPlayerCards.add(firstInputLine[i]);
            secondPlayerCards.add(secondInputLine[i]);
        }
    }
    private static void printWinner(LinkedHashSet<Integer> firstPlayerCards,
                                     LinkedHashSet<Integer> secondPlayerCards){
        if(firstPlayerCards.size()>secondPlayerCards.size()){
            System.out.println("First player win!");
        }
        else if (secondPlayerCards.size()>firstPlayerCards.size()){
            System.out.println("Second player win!");
        }
        else{
            System.out.println("Draw!");
        }
    }

}
