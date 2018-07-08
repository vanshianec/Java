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
       Path path =Paths.get("D:\\java\\input.txt");
       Path output = Paths.get("D:\\java\\output.txt");
       try{
           List<String> lines = Files.readAllLines(path);
           Collections.sort(lines);
           Files.write(output,lines);

       }
       catch(IOException e){
           e.printStackTrace();
       }


    }
}
