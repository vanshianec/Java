import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split("\\s+");
        double result=0;
        for (String word : input) {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            double number = Double.parseDouble(word.substring(1, word.length() - 1));
            if (Character.isUpperCase(firstLetter)) {
                number = number / alphabetPositionUpperCase(firstLetter);
            } else {
                number = number * alphabetPositionLowerCase(firstLetter);
            }
            if (Character.isUpperCase(lastLetter)) {
                number = number - alphabetPositionUpperCase(lastLetter);
            } else {
                number = number + alphabetPositionLowerCase(lastLetter);
            }
            result+=number;


        }
        System.out.printf("%.2f",result);


    }

    private static int alphabetPositionUpperCase(char letter) {
        int asciiCode = (int) letter;
        int upperCaseTemp = 64;
        return asciiCode - upperCaseTemp;
    }

    private static int alphabetPositionLowerCase(char letter) {
        int asciiCode = (int) letter;
        int lowerCaseTemp = 96;
        return asciiCode - lowerCaseTemp;
    }
}