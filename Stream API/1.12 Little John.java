import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("((>----->)|(>>----->)|(>>>----->>))");
        int bigArrowsCount=0;
        int medArrowsCount=0;
        int smallArrowsCount=0;
        for(int i=0;i<4;i++){
        String input = reader.readLine();
           Matcher matcher = pattern.matcher(input);
           while(matcher.find()){
               if(matcher.group(2)!=null){
                   smallArrowsCount++;
               }
               else if(matcher.group(3)!=null){
                   medArrowsCount++;
               }
               else if (matcher.group(4)!=null){
                   bigArrowsCount++;
               }
           }

        }
       
        String decimal = smallArrowsCount+""+medArrowsCount+""+bigArrowsCount;
        String toBinary=Integer.toBinaryString(Integer.parseInt(decimal));
        StringBuilder str =new StringBuilder(toBinary);
        String reversed = str.reverse().toString();
        System.out.println(Integer.parseInt(toBinary+reversed,2));



    }

}





