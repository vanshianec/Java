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
		int rows = Integer.parseInt(input[0]);
		int cols = Integer.parseInt(input[1]);
		String[][] matrix = new String[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			String row[] = scanner.nextLine().split(" ");

			matrix[i] = row;

		}
		String command = scanner.nextLine();
		while(!command.equals("END")) {
			String[] tokens = command.split(" ");
			boolean outOfMatrix=false;
			String firstCell="";
			String secondCell="";
			try {
				 firstCell=matrix[Integer.parseInt(tokens[1])][Integer.parseInt(tokens[2])];
				 secondCell = matrix[Integer.parseInt(tokens[3])][Integer.parseInt(tokens[4])];
				
			}
			catch(Exception e) {
				outOfMatrix=true;
			}
			if(tokens.length!=5||!tokens[0].equals("swap")) {
				System.out.println("Invalid input!");
			}
			else if (outOfMatrix) {
				System.out.println("Invalid input!");
			}
			else {
				matrix[Integer.parseInt(tokens[1])][Integer.parseInt(tokens[2])]=secondCell;
				matrix[Integer.parseInt(tokens[3])][Integer.parseInt(tokens[4])]=firstCell;
				for (String[]row : matrix) {
					System.out.println(String.join(" ",row));
				}
				
			}
			
			
			
			command=scanner.nextLine();
		}

	}

}
