import java.util.Scanner;
public class Programming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        if(!input.contains("://")){
            System.out.println("Invalid URL");
            return;
        }
        String protocol[]=input.split("://");
        if(protocol.length>2||protocol.length==0){
            System.out.println("Invalid URL");
            return;
        }

        String validProtocol=protocol[0];
        String URL = protocol[1];
        String server=URL.substring(0,URL.indexOf('/'));
        String resource=URL.substring(URL.indexOf('/')+1);
        System.out.printf("Protocol = %s%n",validProtocol);
        System.out.printf("Server = %s%n",server);
        System.out.printf("Resources = %s%n",resource);


    }
}