import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) {

        File textPath = new File("D:\\java\\inputOne.txt");
        File wordsPath = new File("D:\\java\\inputTwo.txt");
        File outputPath = new File("D:\\java\\output.txt");

        try (BufferedReader inputOne = new BufferedReader(new FileReader(textPath));
             BufferedReader inputTwo = new BufferedReader(new FileReader(wordsPath));
             PrintWriter out = new PrintWriter(outputPath)) {
             List<String> allLinesOne =  inputOne.lines().collect(Collectors.toList());
             List<String> allLinesTwo = inputTwo.lines().collect(Collectors.toList());
            for (String line : allLinesOne) {
                out.println(line);
            }
            for (String line : allLinesTwo)
               out.println(line);
            }

         catch (IOException e) {
            e.printStackTrace();
        }


    }
}
