
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord= input.next();
        String secondWord= input.next();

        int one = input.nextInt();
        int two = input.nextInt();
        int three = input.nextInt();

        int sum = one + two + three;
        
        String thirdWord = input.next();

        System.out.printf("%s %s %s %d",firstWord,secondWord,thirdWord,sum);

    }
}
