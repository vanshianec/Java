import java.math.BigInteger;
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
		int size = Integer.parseInt(scanner.nextLine());
		int matrix[][] = new int[size][size];

		for (int i = 0; i < size; i++) {
			String[] row = scanner.nextLine().split(" ");
			for (int j = 0; j < size; j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}
		int firstDiagonal = 0;
		int secondDiagonal = 0;
		
		for (int i = 0; i < size; i++) {
			firstDiagonal += matrix[i][i];
			secondDiagonal += matrix[i][size - 1 - i];

		}
		System.out.println(Math.abs(firstDiagonal-secondDiagonal));
		

	}
}
