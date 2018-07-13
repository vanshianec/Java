import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args)  {
     Scanner scanner = new Scanner(System.in);
     String []input =scanner.nextLine().split(" " );
     int lowerBond= Integer.parseInt(input[0]);
     int upperBond= Integer.parseInt(input[1]);
     String condition = scanner.nextLine();

     Predicate<Integer> oddOrEven = num -> checkOddOrEven(condition,num);

     for(int i=lowerBond;i<=upperBond;i++){
         if(oddOrEven.test(i)){
             System.out.print(i+" ");
         }
     }





    }
    private static boolean checkOddOrEven(String condition,int number){
        if(condition.equals("odd")){
            return number%2!=0;
        }
        return number%2==0;
    }
}