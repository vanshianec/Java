import java.math.BigInteger;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String [] input = scanner.nextLine().split(", ");
		int n = Integer.parseInt(input[0]);
	    int [][]matrix = new int[n][n];
	    if(input[1].equals("A")) {
	    	fillMatrixPatternA(matrix);
	    }
	    else if (input[1].equals("B")) {
	    	fillMatrixPatternB(matrix);
	    }
	    
	    printMatrix(matrix);
		  

		

	}
	private static void fillMatrixPatternA(int [][]matrix) {
		int counter=1;
		for (int col = 0;col<matrix[0].length;col++) {
			
			for (int row = 0;row<matrix.length;row++) {
				
				matrix[row][col]=counter;
				counter++;
			}
		}
		
		
	}
	private static void fillMatrixPatternB(int [][] matrix) {
		int counter=1;
		for (int col=0;col<matrix[0].length;col++) {
			if(col%2==0) {
				for (int row=0;row<matrix.length;row++) {
					matrix[row][col]=counter;
					counter++;
				}
			}
			else if (col%2!=0) {
				for (int row=matrix.length-1;row>=0;row--) {
					matrix[row][col]=counter;
					counter++;
				}
			}
		}
		
	}
	private static void printMatrix(int[][]matrix) {
		for (int[] row : matrix) {
		   
			for (int i=0;i<row.length;i++) {
				System.out.print(row[i]+" ");
			}
			System.out.println();
		}
	}

}
