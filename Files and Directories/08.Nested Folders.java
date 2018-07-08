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
       File directory = new File("D:\\java");
       Queue<File> directories = new LinkedList<>();
       int counter=0;
       if(directory.exists()){
           if(directory.isDirectory()){
               directories.add(directory);
               counter++;
               while(!directories.isEmpty()){
                   File currentDirectory=directories.poll();
                   File [] files = currentDirectory.listFiles();
                   for(File file : files){
                       if(file.isDirectory()){
                           directories.add(file);
                           counter++;
                       }

                   }
                   System.out.println(currentDirectory.getName());



               }
               System.out.printf("%d folders",counter);


           }

       }



    }
}
