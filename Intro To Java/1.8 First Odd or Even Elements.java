import java.util.Arrays;
import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String array[] = input.nextLine().split(" ");
		String command[] = input.nextLine().split(" ");
		int length = Integer.parseInt(command[1]);
		String oddOrEven = command[2];
		int counter = 0;
		int arrayLength = 0;
		int oddOrEvenArray[] = new int[0];

		if (oddOrEven.equals("odd")) {
			for (int i = 0; i < array.length; i++) {
				if (Integer.parseInt(array[i]) % 2 != 0) {
					if (arrayLength == length) {
						break;
					}
					arrayLength++;

				}
			}
			oddOrEvenArray = new int[arrayLength];
			for (int i = 0; i < array.length; i++) {
				if (counter == length) {
					for (int x : oddOrEvenArray) {
						System.out.print(x + " ");
					}
					return;
				} else if (Integer.parseInt(array[i]) % 2 != 0) {
					oddOrEvenArray[counter] = Integer.parseInt(array[i]);
					counter++;
				}

			}
		} else if (oddOrEven.equals("even")) {
			for (int i = 0; i < array.length; i++) {
				if (Integer.parseInt(array[i]) % 2 == 0) {
					if (arrayLength == length) {
						break;
					}
					arrayLength++;
				}
			}
			oddOrEvenArray = new int[arrayLength];
			for (int i = 0; i < array.length; i++) {
				if (counter == length) {
					for (int x : oddOrEvenArray) {
						System.out.print(x + " ");
					}
					return;
				} else if (Integer.parseInt(array[i]) % 2 == 0) {
					oddOrEvenArray[counter] = Integer.parseInt(array[i]);
					counter++;
				}
			}
		}

		for (int x : oddOrEvenArray) {
			System.out.print(x + " ");
		}
	}
}
