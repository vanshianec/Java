import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> cars = new HashSet();
       String input = scanner.nextLine();
       while(!input.equals("END")){
           String command=input.split(", ")[0];
           String carId = input.split(", ")[1];
           if(command.equals("IN")){
                cars.add(carId);
           }
           else if(command.equals("OUT")){
               if(cars.contains(carId)){
                   cars.remove(carId);
               }
           }



           input=scanner.nextLine();
       }
       if(cars.isEmpty()){
           System.out.println("Parking Lot is Empty");
       }
       else{
           for(String car : cars){
               System.out.println(car);
           }
       }

    }
}

