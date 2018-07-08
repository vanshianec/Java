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

        try(InputStream inputStream = new FileInputStream(input);
            OutputStream outputStream = new FileOutputStream(output)){
            int oneByte = inputStream.read();
            while(oneByte>=0){
                if(oneByte==10||oneByte==32){
                    outputStream.write(oneByte);
                }
                else{
                    String oneByteDigits =String.valueOf(oneByte);
                    for (int i=0;i<oneByteDigits.length();i++){
                        outputStream.write(oneByteDigits.charAt(i));
                    }

                }
                    oneByte=inputStream.read();
                }


        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
