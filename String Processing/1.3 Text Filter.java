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
      List<String> bannedWords= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
      String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            if(text.contains(bannedWord)){

                text=text.replace(bannedWord,newString('*',bannedWord.length()));
            }
        }
        System.out.println(text);

    }
    public static String newString(char ch,int length){
        StringBuilder str =new StringBuilder();
        while(length-->0){
            str.append(ch);
        }
        return str.toString();
    }
}