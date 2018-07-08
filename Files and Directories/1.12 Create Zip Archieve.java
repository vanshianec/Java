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

        File firstFile = new File("D:\\java\\file1.txt");
        File secondFile = new File("D:\\java\\file2.txt");
        File thirdFile = new File("D:\\java\\file3.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\java\\files.zip");
             FileInputStream firstFileInputStream = new FileInputStream(firstFile);
             FileInputStream secondFileInputStream = new FileInputStream(firstFile);
             FileInputStream thirdFileInputStream = new FileInputStream(firstFile);
             ZipOutputStream zipArchieve = new ZipOutputStream(fileOutputStream)) {

            addToZipArchieve(firstFile, firstFileInputStream, zipArchieve);
            addToZipArchieve(secondFile, secondFileInputStream, zipArchieve);
            addToZipArchieve(thirdFile, thirdFileInputStream, zipArchieve);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addToZipArchieve(File firstFile, FileInputStream inputStream, ZipOutputStream zipArchieve) throws IOException {
        zipArchieve.putNextEntry(new ZipEntry(firstFile.getPath()));
        byte[] bytes = new byte[1024];
        int length;
        while ((length = inputStream.read(bytes)) >= 0) {
            zipArchieve.write(bytes, 0, length);
        }
    }

}

