
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int a=1;a<=8;a++){
            for(int b =a+1;b<=9;b++){
                for(int c=b+1;c<=10;c++){

                       System.out.printf("%d %d %d%n",a,b,c);

                }
            }
        }
    }
}
