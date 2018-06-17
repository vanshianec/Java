
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String firstName = input.nextLine();
       String secondName = input.nextLine();


      if (firstName.isEmpty()&&secondName.isEmpty()){

           firstName="*****";
           secondName="*****";
       }
      else if (firstName.isEmpty()){
          firstName="*****";
      }
      else if (secondName.isEmpty()){
          secondName="*****";
      }

       System.out.printf("Hello, %s %s!",firstName,secondName);





    }
}
