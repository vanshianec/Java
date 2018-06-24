import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] text = scanner.nextLine().split("[ ,;:.!()\\\\\"'\\/\\[\\]]+");
		List<String> upperCase = new ArrayList<>();
		List<String> lowerCase = new ArrayList<>();
		List<String> mixedCase = new ArrayList<>();
		for (String word : text) {
			String wordCopy = word;
			boolean mixed = false;
		       if(word.trim().length()==0) {
		    	   continue;
		       }
			for (int i = 0; i < word.length(); i++) {
			
				char ch = word.charAt(i);
				if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
					mixed = true;
					break;
				}
			}
			if (mixed) {
				mixedCase.add(word);

			} else if (wordCopy.toUpperCase().equals(word)) {
				upperCase.add(word);
			} else if (wordCopy.toLowerCase().equals(word)) {
				lowerCase.add(word);
			} else {
				mixedCase.add(word);
			}
		}
		System.out.print("Lower-case: ");
		System.out.println(String.join(", ", lowerCase));
		System.out.print("Mixed-case: ");
		System.out.println(String.join(", ", mixedCase));
		System.out.print("Upper-case: ");
		System.out.println(String.join(", ", upperCase));
	}

}
