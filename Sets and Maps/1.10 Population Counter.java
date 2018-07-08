import java.util.*;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Long>> populationData = new LinkedHashMap<>();
        LinkedHashMap<String, Long> countryTotalPopulation = new LinkedHashMap<>();

        String input =scanner.nextLine();
        while(!input.equals("report")){
            String cityName=input.split("\\|")[0];
            String countryName =input.split("\\|")[1];
            long population=Long.parseLong(input.split("\\|")[2]);
            if(!populationData.containsKey(countryName)){
                populationData.put(countryName,new LinkedHashMap<>());
                populationData.get(countryName).put(cityName,population);
                countryTotalPopulation.put(countryName,population);
            }
            else{
                populationData.get(countryName).put(cityName,population);
                countryTotalPopulation.put(countryName,countryTotalPopulation.get(countryName)+population);

            }

            input=scanner.nextLine();
        }



        countryTotalPopulation=countryTotalPopulation.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));




        for (Map.Entry<String, Long> countryPopulation : countryTotalPopulation.entrySet()) {
            System.out.printf("%s (total population: %d)%n",countryPopulation.getKey(),countryPopulation.getValue());
            LinkedHashMap<String,Long>cityStats=populationData.get(countryPopulation.getKey());
            cityStats=cityStats.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));
            for (Map.Entry<String, Long> entry : cityStats.entrySet()) {
                System.out.printf("=>%s: %d%n",entry.getKey(),entry.getValue());
            }
        }


    }

}
