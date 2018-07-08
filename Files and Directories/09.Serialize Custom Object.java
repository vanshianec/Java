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

        Square customSquare = new Square(43, 32.1, "black");
        File ser = new File("D:\\java\\test.ser");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ser));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ser))){

            outputStream.writeObject(customSquare);
            Square currentSquare = (Square) inputStream.readObject();
            System.out.println(currentSquare);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

class Square implements Serializable {
    private double width;
    private double height;
    private String color;

    public Square() {
        width = 1;
        height = 1;
        color = "white";
    }

    public Square(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public String toString(){
        return String.format("width: %f, height: %f, color: %s%n",width,height,color);
    }
}
