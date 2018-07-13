import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       List<Integer> gems = Arrays.stream(scanner.nextLine()
               .split(" "))
               .map(Integer::parseInt)
               .collect(Collectors.toList());
        String commands = scanner.nextLine();
        gems.add(0,0);
        gems.add(gems.size(),0);
        LinkedHashSet<Integer> markedIndexes = new LinkedHashSet<>();
        while(!commands.equals("Forge")){
            String tokens[] = commands.split(";");
            String command=tokens[0];
            String filterType = tokens[1];
            String filterParameter = tokens[2];
            for(int i=1;i<gems.size()-1;i++){
                int gem=gems.get(i);
                int prevElement=gems.get(i-1);
                int nextElement=gems.get(i+1);
             Predicate<Integer> filterCondition = getCondition(filterType,prevElement,nextElement,filterParameter);
               switch(command){
                   case "Exclude":
                       if(filterCondition.test(gem)){
                           markedIndexes.add(i);
                       }
                       break;
                   case "Reverse":
                       if(filterCondition.test(gem)){
                           markedIndexes.remove(i);
                       }
               }
            }



            commands=scanner.nextLine();
        }
        for (int i=1;i<gems.size()-1;i++){
            if(!markedIndexes.contains(i)){
                System.out.print(gems.get(i)+" ");
            }
        }



    }
    private static Predicate<Integer> getCondition(String filterType,int prevElement,int nextElement,String filterParameter){
        switch(filterType){
            case "Sum Left":
                return gem -> prevElement + gem == Integer.parseInt(filterParameter);
            case "Sum Right":
                return gem -> nextElement + gem == Integer.parseInt(filterParameter);

        }
        return gem -> prevElement + gem + nextElement == Integer.parseInt(filterParameter);

    }
}
