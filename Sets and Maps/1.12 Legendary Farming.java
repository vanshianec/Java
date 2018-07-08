import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Long> keyMaterials = new LinkedHashMap<>();
        TreeMap<String, Long> junk = new TreeMap<>();
        keyMaterials.put("motes", 0L);
        keyMaterials.put("shards", 0L);
        keyMaterials.put("fragments", 0L);
        String line=scanner.nextLine();
        while(true) {
            String input[] = line.split(" ");
            for (int i = 0; i < input.length - 1; i += 2) {
                long quantity = Long.parseLong(input[i]);
                String material = input[i + 1].toLowerCase();
                if (material.equals("motes") || material.equals("shards") || material.equals("fragments")) {


                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        keyMaterials = orderByDescending(keyMaterials);
                        printResult(keyMaterials, junk, material);
                        return;
                    }


                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        junk.put(material, junk.get(material) + quantity);
                    }
                }


            }
            line=scanner.nextLine();
        }


    }

    private static void printResult(LinkedHashMap<String, Long> keyMaterials, TreeMap<String, Long> junk, String material) {

        if (material.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if (material.equals("fragments")) {
            System.out.println("Valanyr obtained!");
        } else if (material.equals("motes")) {
            System.out.println("Dragonwrath obtained!");
        }
        for (Map.Entry<String, Long> entry : keyMaterials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

        }
        for (Map.Entry<String, Long> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }

    private static LinkedHashMap<String, Long> orderByDescending(LinkedHashMap<String, Long> keyMaterials) {
        final Comparator<Map.Entry<String, Long>> byValue =
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());
        final Comparator<Map.Entry<String ,Long>> byKey=
                Comparator.comparing(Map.Entry::getKey);
        return keyMaterials.entrySet().stream().sorted(byValue.thenComparing(byKey)).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));


    }
}
