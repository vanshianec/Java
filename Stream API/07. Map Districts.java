import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, List<Integer>> cities = new HashMap<>();
        String[] tokens = input.readLine().split("\\s+");
        fillCities(cities, tokens);
        int minPopulation = Integer.parseInt(input.readLine());

        cities.entrySet().stream()
                .filter(keyValuePair -> keyValuePair.getValue().stream().reduce((x, y) -> x + y).get() > minPopulation)
                .sorted((kv2, kv1) -> kv1.getValue().stream().reduce((x, y) -> x + y).get()
                        .compareTo(kv2.getValue().stream().reduce((x, y) -> x + y).get()))
                .forEach(keyValuePair -> {
                    System.out.print(keyValuePair.getKey() + ": ");
                    keyValuePair.getValue().stream().sorted((x, y) -> y.compareTo(x)).limit(5).forEach(value -> System.out.print(value + " "));
                    System.out.println();
                });


    }

    private static void fillCities(HashMap<String, List<Integer>> cities, String[] tokens) {
        for (String token : tokens) {
            String cityName = token.split(":")[0];
            int districtPopulation = Integer.parseInt(token.split(":")[1]);
            if (!cities.containsKey(cityName)) {
                cities.put(cityName, new ArrayList<Integer>());
            }
            cities.get(cityName).add(districtPopulation);

        }
    }
}
