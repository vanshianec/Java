import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		int lastIndex = 0;
		int sum = 0;
		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			sum += str1.charAt(i) * (str2.charAt(i));
			lastIndex++;
		}
		if (str1.length() > str2.length()) {
			for (int i = lastIndex; i < str1.length(); i++) {
				sum += str1.charAt(i);
			}
		} else if (str1.length() < str2.length()) {
			for (int i = lastIndex; i < str2.length(); i++) {
				sum += str2.charAt(i);
			}
		}
		System.out.println(sum);
	}

}
