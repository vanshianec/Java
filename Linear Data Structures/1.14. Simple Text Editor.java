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
	private static long memo[];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder("");
		int N = Integer.parseInt(scanner.nextLine());
        Stack<String> textBeforeCommand=new Stack();
		for (int i = 0; i < N; i++) {
			String tokens[] = scanner.nextLine().split(" ");
			int command = Integer.parseInt(tokens[0]);

			switch (command) {
			case 1:
				textBeforeCommand.push(str.toString());
				append(tokens[1], str);
				break;
			case 2:
				textBeforeCommand.push(str.toString());
				erase(Integer.parseInt(tokens[1]), str);
				break;
			case 3:
				printElement(Integer.parseInt(tokens[1]),str);
				break;
			case 4:
				//command Undo
				String textBefore = textBeforeCommand.pop();
			    StringBuilder beforeStr = new StringBuilder(textBefore);
			    str=beforeStr;
			    break;
			 default :
				 break;
			}

		}
	}

	private static void append(String text, StringBuilder str) {
		str = str.append(text);
	}

	private static void erase(int count, StringBuilder str) {
		str = str.delete(str.length() - count, str.length());
	}
	private static void printElement(int index,StringBuilder str) {
		System.out.println(str.charAt(index-1));
	}

}
