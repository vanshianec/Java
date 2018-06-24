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
		for (String word : text) {
			queue.add(word);
		}
		while (queue.size() > 1) {

			for (int i = 1; i < number; i++) {

				queue.offer(queue.poll());
			}

			System.out.println("Removed " + queue.poll());

		}

		System.out.println("Last is " + queue.poll());

	}

}
