import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumbers[] =scanner.nextLine().split(" ");
        HashMap<String,Integer> numbersSameValuesCount = new HashMap<>();

        for (int i=0;i<inputNumbers.length;i++){
            String number=inputNumbers[i];
            if(!numbersSameValuesCount.containsKey(number)){
                numbersSameValuesCount.put(number,0);
            }
            int value=numbersSameValuesCount.get(number);
            numbersSameValuesCount.put(number,value+1);

        }
        for (Map.Entry<String, Integer> entry : numbersSameValuesCount.entrySet()) {
            System.out.printf("%s - %d times%n",entry.getKey(),entry.getValue());
        }




    }
}

