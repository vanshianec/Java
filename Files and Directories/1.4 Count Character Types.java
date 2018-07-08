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
        int vowelsCounter = 0;
        int consonantsCounter =0;
        int punctuationCounter =0;

        try(FileInputStream fileInputStream = new FileInputStream(path);
        PrintWriter printWriter = new PrintWriter(new File("D:\\java\\output.txt"))){
            int oneByte = fileInputStream.read();
            while(oneByte>=0){
                char character=(char)oneByte;
                if(character==' '||character=='\r'||character=='\n'){

                }
                else if (character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                    vowelsCounter++;
                }
                else if (character=='!'||character=='?'||character=='.'||character==','){
                    punctuationCounter++;
                }
                else{
                    consonantsCounter++;
                }



                oneByte=fileInputStream.read();
            }
            printWriter.printf("Vowels: %d%n",vowelsCounter);
            printWriter.printf("Consonants: %d%n",consonantsCounter);
            printWriter.printf("Punctuation: %d%n",punctuationCounter);


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}

