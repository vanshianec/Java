import java.util.Scanner;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Programming {
	private static long memo[];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = Integer.parseInt(scanner.nextLine());
		String[] array = scanner.nextLine().split(" ");
		List<Long> plants = new ArrayList();
		for (int i = 0; i < N; i++) {
			plants.add(Long.parseLong(array[i]));
		}

		int counter = 0;
		Stack<Long> removedPlants = new Stack();
		boolean removedPlant = false;
		while (true) {
			removedPlant = false;
			for (int i = 0; i < plants.size() - 1; i++) {
				if (plants.get(i) < plants.get(i + 1)) {
					removedPlants.push(plants.get(i + 1));
					removedPlant = true;
				}
			}
			while (!removedPlants.isEmpty()) {
				plants.remove(removedPlants.pop());
			}

			if (removedPlant) {
				counter++;
			} else {
				System.out.println(counter);
				return;
			}
		}
	}
}
