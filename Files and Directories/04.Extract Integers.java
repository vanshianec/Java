import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Programming {
    public static void main(String[] args) {
        File input = new File("D:\\java\\input.txt");
        File output = new File("D:\\java\\output.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(input));
            PrintWriter printWriter = new PrintWriter(output)){

             while(scanner.hasNext()){
               if(scanner.hasNextInt()){
                   printWriter.println(scanner.nextInt());
               }
                scanner.next();
             }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
