import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(", ");
		int rows = Integer.parseInt(input[0]);
		int columns = Integer.parseInt(input[1]);
        int sum =0;
		int matrix[][] = new int[rows][columns];

		for (int i = 0; i < matrix.length; i++) {
			String[] elements = scanner.nextLine().split(", ");
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = Integer.parseInt(elements[j]);
				sum+=matrix[i][j];
			}
		}
		
		System.out.printf("%d%n%d%n%d%n", rows,columns,sum);

	}

}
