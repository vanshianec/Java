import java.util.Scanner;

class Programming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String [] input=scanner.nextLine().split(" ");
		int rows = Integer.parseInt(input[0]);
		int columns =Integer.parseInt(input[1]);
		int matrix[][]=new int[rows][columns];		
		for (int i=0;i<rows;i++) {
			String [] row = scanner.nextLine().split(" ");
			for (int j=0;j<columns;j++) {
				matrix[i][j]=Integer.parseInt(row[j]);
			}
		}
		
		printThreeByThreeMatrixMaxSum(matrix);
	}
	private static void printThreeByThreeMatrixMaxSum(int[][]matrix) {
		int bestRow=0;
		int bestCol=0;
		int bestSum=0;
		int sum=0;
		
		for (int i=0;i<matrix.length-2;i++) {
			for (int j=0;j<matrix[i].length-2;j++) {
				sum=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
						matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+
						matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				
				if(sum>bestSum) {
					bestSum=sum;
					bestCol=j;
					bestRow=i;
					
				}
				
			}
		}
		System.out.println("Sum = "+bestSum);
		System.out.printf("%d %d %d%n",matrix[bestRow][bestCol],matrix[bestRow][bestCol+1],matrix[bestRow][bestCol+2]);
		System.out.printf("%d %d %d%n", matrix[bestRow+1][bestCol],matrix[bestRow+1][bestCol+1],matrix[bestRow+1][bestCol+2]);
		System.out.printf("%d %d %d%n", matrix[bestRow+2][bestCol],matrix[bestRow+2][bestCol+1],matrix[bestRow+2][bestCol+2]);
		
	}

}
