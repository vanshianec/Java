import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> array = Arrays.stream(input.nextLine().split(" ")).collect(Collectors.toList());
		String command = input.nextLine();
		int vehiclesSoldCounter = 0;
		
		while (!command.equals("End of customers!")) {
			String[] commands = command.split(" ");
			boolean foundVehicle = false;
			char vehicleType = commands[0].toLowerCase().charAt(0);
			int numberOfSeats = Integer.parseInt(commands[2]);
			for (int i = 0; i < array.size(); i++) {
				int seatsCount = Integer.parseInt(array.get(i).substring(1, array.get(i).length()));
				if (array.get(i).charAt(0) == vehicleType && seatsCount == numberOfSeats) {
					int price = calculatePrice(array.get(i).charAt(0), seatsCount);
					System.out.printf("Yes, sold for %d$%n", price);
					vehiclesSoldCounter++;
					array.remove(i);
					foundVehicle = true;
					break;
				}
			}
			if (!foundVehicle) {
				System.out.println("No");
			}
			command = input.nextLine();
		}
		System.out.print("Vehicles left: ");
		System.out.println(String.join(", ", array));
		System.out.print("Vehicles sold: ");
		System.out.println(vehiclesSoldCounter);

		
	}

	private static int calculatePrice(char vehicle, int seatsCount) {
		return vehicle * seatsCount;

	}

}
