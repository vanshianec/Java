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

        HashSet<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation,',','.','!','?');
        try (InputStream inputStream = new FileInputStream("D:\\java\\input.txt");
             OutputStream outputStream = new FileOutputStream("D:\\java\\output.txt")) {
             int oneByte = inputStream.read();
             while(oneByte>=0){
                 if(!punctuation.contains((char)oneByte)){
                     outputStream.write(oneByte);
                 }

                 oneByte=inputStream.read();
             }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
