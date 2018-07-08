import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text =scanner.nextLine().toLowerCase();
        String wordToMatch = scanner.nextLine().toLowerCase();


        int occurenacesCounter=0;

        for (int i=0;i<text.length()-wordToMatch.length()+1;i++){
            String substring=text.substring(i,i+wordToMatch.length());
            if(wordToMatch.equals(substring)){
                occurenacesCounter++;
            }

        }
        System.out.println(occurenacesCounter);


    }
}