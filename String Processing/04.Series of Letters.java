import java.util.Scanner;
public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        StringBuilder str = new StringBuilder(input);

        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                str.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(str.toString());


    }
}