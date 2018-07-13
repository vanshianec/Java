import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        TreeMap<String,LinkedHashMap<String,Integer>> companies = new TreeMap<>();
        while(N -- > 0){
            String input = reader.readLine().replace("|","");
            String[] tokens = input.split(" - ");
            String company = tokens[0];
            int amount = Integer.parseInt(tokens[1]);
            String product = tokens[2];
            if(!companies.containsKey(company)){
                companies.put(company, new LinkedHashMap<>());
                companies.get(company).put(product,amount);
            }
            else{
               if(!companies.get(company).containsKey(product)){
                   companies.get(company).put(product,amount);
               }
               else{
                   companies.get(company).put(product,companies.get(company).get(product)+amount);
               }
            }
            }
            for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : companies.entrySet()) {
                System.out.printf("%s: ",entry.getKey());
                LinkedHashMap<String,Integer> products = entry.getValue();
                    List<String> output = new ArrayList<>();
                for (Map.Entry<String, Integer> innerEntry : products.entrySet()) {
                    output.add(innerEntry.getKey()+"-"+innerEntry.getValue());
                }
                     System.out.print(String.join(", ",output));
                System.out.println();




        }


    }

}





