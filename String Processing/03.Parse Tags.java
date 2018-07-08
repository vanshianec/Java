import java.util.Scanner;
public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        int firstTagIndex = input.indexOf("<upcase>");
        while(firstTagIndex!=-1){
            int secondTagIndex=input.indexOf("</upcase>");
            int tagLength=8;
            String oldString = input.substring(firstTagIndex+tagLength,secondTagIndex);
            String newString = oldString.toUpperCase();
            input=input.replace(oldString,newString);
            StringBuilder str = new StringBuilder(input);
            str.delete(firstTagIndex,firstTagIndex+8);
            str.delete(secondTagIndex-tagLength,secondTagIndex+9-tagLength);
            input=str.toString();


            firstTagIndex=input.indexOf("<upcase>");
        }
        System.out.println(input);


    }
}