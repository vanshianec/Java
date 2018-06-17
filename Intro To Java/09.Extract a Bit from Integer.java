
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();
        int p =input.nextInt();
        int mask=n>>p;
        int result = mask&1;
        System.out.println(result);
    }
}
