import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String []tokens = input.split(" ");
        Collections.addAll(stack, tokens);
        while(stack.size()>1) {
        	int firstNumber=Integer.valueOf(stack.pop());
        	String operator = stack.pop();
        	int secondNumber=Integer.valueOf(stack.pop());
        	
        	switch(operator) {
        	case "+":
        		stack.push(String.valueOf(firstNumber+secondNumber));
        		break;
        	case "-":
        		stack.push(String.valueOf(firstNumber-secondNumber));
        	}
        	
        }
        System.out.println(stack.pop());
       
	}

}
