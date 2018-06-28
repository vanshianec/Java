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
		int input = scanner.nextInt();
		memo = new long[input+1];
		System.out.println(fibonacci(input));
		
	}
	public static long fibonacci(int number) {
		if(number<=1) {
			return 1;
		}
		if(memo[number]!=0) {
			return memo[number];
		}
		memo[number]=fibonacci(number-1)+fibonacci(number-2);
		return memo[number];
		
		
	}

}
