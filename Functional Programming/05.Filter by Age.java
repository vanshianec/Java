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
    public static void main(String[] args)   {
       Scanner scanner = new Scanner(System.in);
       int numberOfLines = Integer.parseInt(scanner.nextLine());
       Map<String,Integer> persons = new LinkedHashMap<>();
       for (int i=0;i<numberOfLines;i++){
         String input[] = scanner.nextLine().split(", ");
         String name = input[0];
         int age = Integer.parseInt(input[1]);
          persons.put(name,age);
       }
       String condition = scanner.nextLine();
       int age = Integer.parseInt(scanner.nextLine());
       String format = scanner.nextLine();
        Predicate<Integer> ageCondition = a -> {
            boolean statement=false;
            switch(condition){
                case "younger":
                    statement=a<age;
                    break;
                case "older":
                    statement=a>=age;
                    break;
            }
            return statement;
        };
        Consumer<Map.Entry<String,Integer>> print = entry -> {
            switch(format){
                case "name":
                    System.out.printf("%s%n",entry.getKey());
                    break;
                case "age":
                    System.out.printf("%d%n",entry.getValue());
                    break;
                case "name age":
                    System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
            }
        };

        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
              if(ageCondition.test(entry.getValue())){
                  print.accept(entry);
              }

        }






    }
}