
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double quantity = input.nextDouble();
       double price = 1.20;

       BigDecimal priceLevs = new BigDecimal(quantity*price);

       BigDecimal exchangeRate = new BigDecimal("4210500000000");
       BigDecimal result = priceLevs.multiply(exchangeRate);
        System.out.printf("%.2f marks",result);





    }
}
