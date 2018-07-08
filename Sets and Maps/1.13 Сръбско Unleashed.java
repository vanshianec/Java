import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(\\D+) @(\\D+) (\\d+) (\\d+)";
        Pattern pattern = Pattern.compile(regex);
        LinkedHashMap<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();


        String command = scanner.nextLine();
        while (!command.equals("End")) {
            Matcher matcher = pattern.matcher(command);

            while (matcher.find()) {
                String singerName = matcher.group(1);
                String venue = matcher.group(2);
                long ticketsPrice = Long.parseLong(matcher.group(3));
                long ticketsCount = Long.parseLong(matcher.group(4));
                if (!data.containsKey(venue)) {
                    data.put(venue, new LinkedHashMap<>());
                    data.get(venue).put(singerName, ticketsCount * ticketsPrice);
                } else {
                    if (!data.get(venue).containsKey(singerName)) {
                        data.get(venue).put(singerName, ticketsCount * ticketsPrice);
                    } else {
                        data.get(venue).put(singerName, data.get(venue).get(singerName) + ticketsCount * ticketsPrice);
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : data.entrySet()) {
            System.out.println(entry.getKey());
            LinkedHashMap<String,Long> singerData =entry.getValue();
            LinkedHashMap<String,Long> sortedData=singerData.entrySet().stream().
                    sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                    collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                            (oldValue , newValue) -> oldValue,LinkedHashMap::new ));
            for (Map.Entry<String, Long> innerEntry : sortedData.entrySet()) {
                System.out.printf("#  %s -> %d%n",innerEntry.getKey(),innerEntry.getValue());
            }
        }
    }
}
