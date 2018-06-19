import java.util.Scanner;




class Programming {
	
		public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 int a = Integer.parseInt(input.next());
		 float b = Float.parseFloat(input.next());
		 float c = Float.parseFloat(input.next());
		 String toHexa = Integer.toHexString(a);
		 String toBinary = Integer.toBinaryString(a);
		
		 int toInt =Integer.parseInt(toBinary);
		 
		 
		 			
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",toHexa.toUpperCase(),toInt,b,c);
		
		
		}
		
			
		
		
	}

	
      
		
	
	

	

	        

