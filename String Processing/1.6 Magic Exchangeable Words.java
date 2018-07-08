import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String firstWord =input.split(" ")[0];
        String secondWord = input.split(" ")[1];

        LinkedHashMap<Character,Character> checker = new LinkedHashMap<>();

        if(firstWord.length()>=secondWord.length()){
            for (int i=0;i<secondWord.length();i++){
                char firstCharacter=firstWord.charAt(i);
                char secondCharacter=secondWord.charAt(i);
                if(!checker.containsKey(firstCharacter)){
                    checker.put(firstCharacter,secondCharacter);
                }
                else{
                    if(checker.get(firstCharacter)!=secondCharacter){
                        System.out.println(false);
                        return;
                    }
                }
            }
            for (int i=secondWord.length()-1;i<firstWord.length();i++){
                char firstCharacter=firstWord.charAt(i);

                if(!checker.containsKey(firstCharacter)){
                    System.out.println(false);
                    return;
                }
            }
        }
        else{

                for (int i=0;i<firstWord.length();i++){
                    char firstCharacter=secondWord.charAt(i);
                    char secondCharacter=firstWord.charAt(i);
                    if(!checker.containsKey(firstCharacter)){
                        checker.put(firstCharacter,secondCharacter);
                    }
                    else{
                        if(checker.get(firstCharacter)!=secondCharacter){
                            System.out.println(false);
                            return;
                        }
                    }
                }
                for (int i=firstWord.length()-1;i<secondWord.length();i++){
                    char firstCharacter=secondWord.charAt(i);

                    if(!checker.containsKey(firstCharacter)){
                        System.out.println(false);
                        return;
                    }
                }

        }
        System.out.println(true);


    }
}