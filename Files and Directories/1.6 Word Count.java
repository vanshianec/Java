import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Programming {
    public static void main(String[] args) {

        File textPath = new File("D:\\java\\text.txt");
        File wordsPath = new File("D:\\java\\words.txt");
        File outputPath = new File("D:\\java\\output.txt");
        LinkedHashMap<String,Integer> wordsCount = new LinkedHashMap<>();

        try (BufferedReader text = new BufferedReader(new FileReader(textPath));
             BufferedReader words = new BufferedReader(new FileReader(wordsPath));
             PrintWriter out = new PrintWriter(outputPath)) {
            String wordsLine = words.readLine();
            while(wordsLine!=null){
                String eachWord[] = wordsLine.split(" ");
                String line = text.readLine();
                while (line != null) {
                    String wordsOnLine[]=line.split(" ");
                    for (String word : eachWord){
                        for(String wordOnLine : wordsOnLine){
                            if(word.equals(wordOnLine)){
                               if(!wordsCount.containsKey(word)){
                                   wordsCount.put(word,1);
                               }
                               else{
                                   wordsCount.put(word,wordsCount.get(word)+1);
                               }
                            }
                        }
                    }
                    line = text.readLine();
                }

                wordsLine=words.readLine();
            }
            wordsCount=wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                    collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue) -> oldValue,
            LinkedHashMap::new));
            for (Map.Entry<String, Integer> entry : wordsCount.entrySet()){
                out.printf("%s - %d%n",entry.getKey(),entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
