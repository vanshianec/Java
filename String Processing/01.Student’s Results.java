import java.util.Scanner;
public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String studentName = input.split("[ \\-,]+")[0];
        double firstResult = Double.parseDouble(input.split("[ \\-,]+")[1]);
        double secondResult = Double.parseDouble(input.split("[ \\-,]+")[2]);
        double thirdResult = Double.parseDouble(input.split("[ \\-,]+")[3]);
        System.out.printf("%-10s|%7s|%7s|%7s|%7s|%n","Name","JAdv","JavaOOP","AdvOOP","Average");
        System.out.printf("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|%n",studentName,firstResult,secondResult,thirdResult,
                (firstResult+secondResult+thirdResult)/3);


    }
}