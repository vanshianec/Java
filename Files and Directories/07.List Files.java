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
       File fileDirectory =new File("D:\\java\\Files-And-Streams");
         if(fileDirectory.exists()){
             if(fileDirectory.isDirectory()){
                 File []currentFiles = fileDirectory.listFiles();
                 for(File file : currentFiles){
                     if(!file.isDirectory()){
                         System.out.printf("%s: [%d]%n",file.getName(),file.length());
                     }
                 }

             }
             
         }




    }
}

