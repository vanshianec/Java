import java.util.Scanner;




class Programming {
	
		public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 int Ax = input.nextInt();
		 int Ay = input.nextInt();
		 int Bx = input.nextInt();
		 int By = input.nextInt();
		 int Cx = input.nextInt();
		 int Cy = input.nextInt();
		 
		 double area=Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
		 System.out.printf("%.0f",area);
		
		
		}
		
			
		
		
	}

	
      
		
	
	

	

	        



	        

