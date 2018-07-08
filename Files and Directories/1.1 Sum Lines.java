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

      String path = "D:\\java\\input.txt";
      File output = new File("D:\\java\\output.txt");

      try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
          PrintWriter printWriter = new PrintWriter(output)){
          String line = bufferedReader.readLine();
          while(line!=null){
          long sum=0;
              char [] characters = line.toCharArray();
              for (char character : characters){
                  sum+=character;
              }

              printWriter.println(sum);
              line=bufferedReader.readLine();
          }



      }
      catch(IOException e){
          e.printStackTrace();
      }
    }

}

