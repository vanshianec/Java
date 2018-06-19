import java.util.Arrays;
import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int bestScore = Integer.MIN_VALUE;
		String winner = null;
		for (int i = 0; i < n; i++) {
			String name = input.nextLine();
			int score = Integer.parseInt(input.nextLine());
			for (int j = 0; j < name.length(); j++) {
				if ((name.charAt(j)) % 2 == 0) {
					score += name.charAt(j);
				} else if (name.charAt(j) % 2 != 0) {
					score -= name.charAt(j);
				}
             
              }
			 if(score>bestScore) {
           	  bestScore=score;
           	  winner=name;
			}

		}
		System.out.printf("The winner is %s - %d points", winner,bestScore);
	}

}
