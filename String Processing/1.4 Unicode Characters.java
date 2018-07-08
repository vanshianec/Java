import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder str = new StringBuilder(word);

        for(int i=0;i<str.length();i++){
            System.out.printf("\\u%04x", (int) str.charAt(i));
        }
    }
}