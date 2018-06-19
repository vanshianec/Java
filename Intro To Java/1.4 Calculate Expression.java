import java.util.Scanner;




class Programming {
	
		public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 
		 double f1 = Math.pow((a*a+b*b)/(a*a-b*b), (a+b+c)/Math.sqrt(c));
		 double f2 =Math.pow(a*a+b*b-c*c*c, a-b);
		 double result = Math.abs(Average(a,b,c)-Average(f1,f2));
		 System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1,f2,result);
		 
		 
		 			
		
		}
		public static double Average(double a,double b ,double c) {
			return (a+b+c)/3;
		}
		public static double Average(double a, double b) {
			return (a+b)/2;
		}
		
			
		
		
	}

	
      
		
	
	

	

	        

