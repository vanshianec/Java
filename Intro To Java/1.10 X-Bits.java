import java.util.Arrays;
import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] array = new String[8];
		int xCounter = 0;
		for (int i = 0; i < 8; i++) {

			String toBinary = String.format("%32s",
					Integer.toBinaryString(Integer.parseInt(input.nextLine()))).replace(' ', '0');

			array[i] = toBinary;
		}
		for (int i = 0; i < array.length - 2; i++) {
			StringBuilder str = new StringBuilder(array[i]);
			StringBuilder str2 = new StringBuilder(array[i + 1]);
			StringBuilder str3 = new StringBuilder(array[i + 2]);

			for (int j = 0; j < array[i].length() - 2; j++) {
				if ((str.charAt(j) == '1' && str.charAt(j + 1) == '0' && str.charAt(j + 2) == '1')
						&& (str2.charAt(j) == '0' && str2.charAt(j + 1) == '1' && str2.charAt(j + 2) == '0')
						&& (str3.charAt(j) == '1' && str3.charAt(j + 1) == '0' && str3.charAt(j + 2) == '1')) {
					xCounter++;
				}
			}

		}
		System.out.println(xCounter);

	}

}
