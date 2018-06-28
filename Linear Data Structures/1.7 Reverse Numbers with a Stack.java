import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		ArrayDeque<Integer> stack = new ArrayDeque();
		for (String number : input) {
			stack.push(Integer.parseInt(number));
		}
		while(stack.size()>0) {
		     System.out.print(stack.pop()+" ");
		}
		
		
		
		
		
	}
	

}
