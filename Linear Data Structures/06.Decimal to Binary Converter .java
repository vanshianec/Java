import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int number= scanner.nextInt();
		if(number==0) {
			System.out.println(number);
			return;
		}
		while(number!=0) {
			stack.push(number%2);
			number/=2;
		}
        while(stack.size()>0) {
        	System.out.print(stack.pop());
        }
			
		
       
	}

}
