import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) {

        File folder = new File("D:\\java");
        File outputPath = new File("D:\\java\\output.txt");
        Queue<File> directories = new LinkedList<>();
        directories.add(folder);
        long bytes = 0;
        try (PrintWriter output = new PrintWriter(outputPath)) {
            while (!directories.isEmpty()) {
                File[] files = directories.poll().listFiles();
                for (File file : files) {
                    if (file.isDirectory()) {
                        directories.add(file);
                    } else {
                        bytes += file.length();
                    }
                }
            }
            output.println(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
