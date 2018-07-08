import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) {

      try(FileInputStream fis = new FileInputStream(new File("D:\\java\\pic.jpg"));
      FileOutputStream fos = new FileOutputStream(new File("D\\java\\picCopy.jpg"))){
          byte[] buffer = new byte[1024];
          int length=fis.read(buffer);
          while(length>0){
              fos.write(buffer,0,length);

              length=fis.read(buffer);
          }



      }
      catch(IOException e){
          e.printStackTrace();
      }


    }
}
