import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for (int i=0;i<text.length();i++) {
			if(text.charAt(i)=='(') {
				stack.push(i);
			}
			else if(text.charAt(i)==')'){
				int startIndex=stack.pop();
				System.out.println(text.substring(startIndex, i+1));
			}
		}
		
       
	}

}
