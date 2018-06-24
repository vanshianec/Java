import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Programming {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text[] = scanner.nextLine().split(" ");
		int number = Integer.parseInt(scanner.nextLine());

		ArrayDeque<String> queue = new ArrayDeque<>();
		int counter = 1;
		for (String word : text) {
			queue.add(word);
		}
		while (queue.size() > 1) {

			for (int i = 1; i < number; i++) {

				queue.offer(queue.poll());
			}
			boolean prime = checkPrime(counter);
			if (prime) {
				System.out.println("Prime " + queue.peek());
			} else {

				System.out.println("Removed " + queue.poll());
			}
			counter++;

		}

		System.out.println("Last is " + queue.poll());

	}

	private static boolean checkPrime(int counter) {
		if (counter <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(counter); i++) {
				if (counter % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
