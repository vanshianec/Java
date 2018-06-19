import java.util.Scanner;




class Programming {
	
		public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 String array[] = input.nextLine().split(" ");
		 
		 if(array.length%2!=0) {
			 System.out.println("invalid length");
		 }
		 else {
			 for(int i=0;i<array.length-1;i+=2) {
				 int a = Integer.parseInt(array[i]);
				 int b = Integer.parseInt(array[i+1]);
				 if(a%2==0 && b%2==0) {
					 System.out.printf("%d, %d -> both are even%n",a,b);
				 }
				 else if (a%2!=0 && b%2!=0) {
					 System.out.printf("%d, %d -> both are odd%n", a,b);
				 }
				 else {
					 System.out.printf("%d, %d -> different%n", a,b);
				 }
			 }
		 }
			 
		 
		 			
		
		}
		
		
		
			
		
		
	}

	
      
		
	
	

	

	        

