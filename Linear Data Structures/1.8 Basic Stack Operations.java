import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    int stackSize = Integer.parseInt(scanner.next());
	    int numberOfElementsToPop = Integer.parseInt(scanner.next());
	    int numberToCheck = Integer.parseInt(scanner.next());
	    scanner.nextLine();
	    
	    ArrayDeque<Integer> stack = new ArrayDeque(stackSize);
	    
	    int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    for (int n : input) {
	    	stack.push(n);
	    }
	    for (int i=0;i<numberOfElementsToPop;i++) {
	    	stack.pop();
	    }
	    if(stack.isEmpty()) {
	    	System.out.println(0);
	    }
	    else if (stack.contains(numberToCheck)) {
	    	System.out.println(true);
	    }
	    else {
	    	int smallestNumber = Integer.MAX_VALUE;
	    	
	    	for (int number : stack) {
	    		if(number<smallestNumber) {
	    			smallestNumber=number;
	    		}
	    	}
	    	System.out.println(smallestNumber);
	    }
	    
	    
		
		
		
		
	}
	

}
