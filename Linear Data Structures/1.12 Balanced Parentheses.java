import java.util.Scanner;
import java.util.Stack;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Programming {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String parentheses = scanner.nextLine();
		Stack<Character> brackets = new Stack();

		for (int i = 0; i < parentheses.length(); i++) {
			if (parentheses.charAt(i) == '(' || parentheses.charAt(i) == '[' || parentheses.charAt(i) == '{') {
                 brackets.push(parentheses.charAt(i));
                 
			}
			else if (parentheses.charAt(i) == ')' || parentheses.charAt(i) == ']' || parentheses.charAt(i) == '}') {
				if(brackets.isEmpty()) {
					System.out.println("NO");
					return;
				}
				else if ((brackets.peek()=='('&&parentheses.charAt(i)==')')||(brackets.peek()=='['&&parentheses.charAt(i)==']')||
						(brackets.peek()=='{'&&parentheses.charAt(i)=='}')) {
					brackets.pop();
				}
				else {
					System.out.println("NO");
					return;
				}
			}

		}
		if(brackets.isEmpty()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
