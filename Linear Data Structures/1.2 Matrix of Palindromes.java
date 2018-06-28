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
		String[] input = scanner.nextLine().split(" ");
		int row = Integer.parseInt(input[0]);
		int col = Integer.parseInt(input[1]);
		char a = 'a';
		char b = 'a';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%c%c%c ", a, b, a);
				b++;
			}
			System.out.println();
			a++;
			b = a;
		}

	}
}
