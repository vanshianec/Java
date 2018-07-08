import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      String firstNumber =scanner.nextLine();
      String secondNumber = scanner.nextLine();

        System.out.println(new BigInteger(firstNumber).add(new BigInteger(secondNumber)));





    }
}