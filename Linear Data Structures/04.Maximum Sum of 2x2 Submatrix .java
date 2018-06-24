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
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			int[] elements = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = elements[j];
			}
		}
		int bestSum = Integer.MIN_VALUE;
		int sum = 0;
		int bestTopLeft = 0;
		int bestTopRight = 0;
		int bestBottomLeft = 0;
		int bestBottomRight = 0;

		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				sum = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] + matrix[i + 1][j + 1];

				if (sum > bestSum) {
					bestSum = sum;
					bestTopLeft = matrix[i][j];
					bestTopRight = matrix[i][j + 1];
					bestBottomLeft = matrix[i + 1][j];
					bestBottomRight = matrix[i + 1][j + 1];
				}
				sum = 0;
			}
		}
		System.out.printf("%d %d%n%d %d%n%d", bestTopLeft, bestTopRight, bestBottomLeft, bestBottomRight, bestSum);

	}

}
