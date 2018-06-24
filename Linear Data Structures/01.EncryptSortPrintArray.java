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
		int n = Integer.parseInt(scanner.nextLine());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			int encryptedValue = encrypt(name);
			array[i]=encryptedValue;
		}
		Arrays.sort(array);
		for (int x : array) {
			System.out.println(x);
		}
		
		
	}

	private static int encrypt(String name) {
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.toLowerCase().charAt(i);
			char originalCh = name.charAt(i);

			switch (ch) {
			case 'a':
				sum += originalCh * name.length();
				break;
			case 'e':
				sum += originalCh * name.length();
				break;
			case 'i':
				sum += originalCh * name.length();
				break;
			case 'u':
				sum += originalCh * name.length();
				break;
			case 'o':
				sum += originalCh * name.length();
				break;

				default :
					sum+=originalCh/name.length();
					break;
			}
			
		}
		return sum;
	}

}
