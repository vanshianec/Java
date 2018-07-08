import java.util.*;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Long> goods = new LinkedHashMap<>();
        String recources = scanner.nextLine();

        while(!recources.equals("stop")){
          Long values = Long.parseLong(scanner.nextLine());
            if(!goods.containsKey(recources)){
                goods.put(recources,values);
            }
            else{
                goods.put(recources,goods.get(recources)+values);
            }


           recources = scanner.nextLine();


        }
        for (Map.Entry<String, Long> entry : goods.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
