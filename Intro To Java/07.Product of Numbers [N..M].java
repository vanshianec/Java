
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();
        BigInteger result= BigInteger.ONE;

        for(int i=firstNumber;i<=secondNumber;i++){
            BigInteger I = new BigInteger(""+i);
            result=result.multiply(I);
        }
        System.out.printf("product[%d..%d] = %d\n", firstNumber, secondNumber, result);
    }
}
