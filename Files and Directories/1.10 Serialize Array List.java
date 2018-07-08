import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) {

      List<Double> numbers = new ArrayList<>();
        Collections.addAll(numbers,65.3,43.2,54.6,8.5);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\java\\list.ser"))){
              objectOutputStream.writeObject(numbers);

        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
