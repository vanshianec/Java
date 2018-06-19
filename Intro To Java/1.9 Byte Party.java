import java.util.Arrays;
import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(input.nextLine());
			int toBinary = Integer.parseInt(Integer.toBinaryString(number));
			String formatedEightBitInteger = String.format("%08d", toBinary);
			array[i] = formatedEightBitInteger;
		}
		
		String command=input.nextLine();
		while(!command.equals("party over")) {
			int[] commands = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
			int doCommand = commands[0];
			int position = commands[1];
			if(doCommand==-1) {
			     flip(array,position);
			}
			else if (doCommand==0) {
				unset(array,position);
			}
			else if (doCommand==1) {
				set(array,position);
			}
			
			
			
			command=input.nextLine();
		}
		for (String s : array) {
			int intValue = Integer.parseInt(s,2);
			System.out.println(intValue);
			
		}
		
         
	}

	private static void flip(String[]array,int position) {
		
		position=array[0].length()-1-position;
		for (int i=0;i<array.length;i++) {
			StringBuilder str = new StringBuilder();
			String eightBitNumber = array[i];
			str.append(eightBitNumber);
			if(str.charAt(position)=='0') {
				str.replace(position,position+1, "1");
			}
			else {
				str.replace(position,position+1, "0");
			}
			array[i]=str.toString();
			
			
		}
	}
	private static void unset(String[]array,int position) {
		position=array[0].length()-1-position;
		for (int i=0;i<array.length;i++) {
			StringBuilder str = new StringBuilder();
			String eightBitNumber = array[i];
			str.append(eightBitNumber);
			str.replace(position,position+1, "0");
					
			array[i]=str.toString();
			
			
		}
	}
	private static void set(String[] array,int position) {
		position=array[0].length()-1-position;
		for (int i=0;i<array.length;i++) {
			StringBuilder str = new StringBuilder();
			String eightBitNumber = array[i];
			str.append(eightBitNumber);
			str.replace(position,position+1, "1");
					
			array[i]=str.toString();
			
			
		}
	}

	
}
