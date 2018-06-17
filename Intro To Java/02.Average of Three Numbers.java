
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double one = input.nextDouble();
       double two = input.nextDouble();
       double three = input.nextDouble();

       double average = (one + two + three)/3;

       System.out.printf("%.2f",average);


    }
}
