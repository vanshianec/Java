import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long blur = Long.parseLong(input.nextLine());
		String[] rowsAndCols = input.nextLine().split(" ");
		int rows = Integer.parseInt(rowsAndCols[0]);
		int cols = Integer.parseInt(rowsAndCols[1]);
		long[][] matrix = new long[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			String rowValues[] = input.nextLine().split(" ");
			for (int j = 0; j < matrix[0].length; j++) {
				long value = Long.parseLong(rowValues[j]);
				matrix[i][j] = value;
			}
		}
		String[] blurCoordinates = input.nextLine().split(" ");
		int x = Integer.parseInt(blurCoordinates[0]);
		int y = Integer.parseInt(blurCoordinates[1]);
		matrix[x][y] += blur;
		try {

			matrix[x + 1][y] += blur;
		} catch (Exception e) {

		}
		try {

			matrix[x + 1][y - 1] += blur;
		} catch (Exception e) {

		}
		try {

			matrix[x + 1][y + 1] += blur;
		} catch (Exception e) {

		}
		try {

			matrix[x - 1][y] += blur;

		} catch (Exception e) {

		}
		try {

			matrix[x - 1][y + 1] += blur;
		} catch (Exception e) {

		}
		try {

			matrix[x - 1][y - 1] += blur;

		} catch (Exception e) {

		}
		try {

			matrix[x][y - 1] += blur;
		} catch (Exception e) {

		}
		try {

			matrix[x][y + 1] += blur;

		} catch (Exception e) {

		}

		for (long[] row : matrix) {
			String[] toStringRow = Arrays.stream(row).mapToObj(String::valueOf).toArray(String[]::new);
			System.out.println(String.join(" ", toStringRow));
		}

	}

}
