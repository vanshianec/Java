import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text[] = scanner.nextLine().split("[ ,.?!]+");
        TreeSet<String> palindromes = new TreeSet<>();
        for (String word : text) {
            if(isPalindrome(word)){
              palindromes.add(word);
            }
        }
        System.out.println(Arrays.toString(palindromes.toArray()));
    }
    public static boolean isPalindrome(String word){
        StringBuilder str = new StringBuilder(word);
        if(str.toString().equals(str.reverse().toString())){
            return true;
        }
        return false;
    }
}