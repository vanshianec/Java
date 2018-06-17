
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      int distance = Integer.parseInt(input.nextLine());
      String dayTime = input.nextLine();
      double price =0;
      if(distance>=100){
          price=distance*0.06;
      }
      else if (distance>=20){
          price=distance*0.09;
      }
      else if (dayTime.equals("day")){
          price=distance*0.79+0.70;
      }
      else if (dayTime.equals("night")){
          price=distance*0.90+0.70;
      }
      System.out.printf("%.2f",price);

    }
}
