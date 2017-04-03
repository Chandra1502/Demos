package niitExamSamples;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns for Matrix 1:");
		int r1 = s.nextInt();
		int c1 = s.nextInt();
		
		System.out.println("Enter the number of rows and columns for Matrix 2:");
		int r2 = s.nextInt();
		int c2 = s.nextInt();
		
		int M1[][] = new int[r1][c1];
		int M2[][] = new int[r2][c2];
		
		if(r1==r2&&c1==c2){
			
			for(int i=0;i<r1;i++){
				System.out.println("Enter the values for row "+(i+1)+" of matrix 1");
				for(int j=0;j<c1;j++){
					M1[i][j] = s.nextInt();
				}
			}
			
			for(int i=0;i<r2;i++){
				System.out.println("Enter the values for row "+(i+1)+" of matrix 2");
				for(int j=0;j<c2;j++){
					M2[i][j] = s.nextInt();
				}
			}
			
			System.out.println("Matrix 1 is :");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					System.out.print(M1[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("Matrix 2 is :");
			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
					System.out.print(M2[i][j]+"\t");
				}
				System.out.println();
			}
			
			int result[][] = new int[r1][c1];
			
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					result[i][j] = M1[i][j]+M2[i][j];
				}
			}
			
			System.out.println("Resultant Matrix :");
			for(int i=0;i<r2;i++){
				for(int j=0;j<c2;j++){
					System.out.print(result[i][j]+"\t");
				}
				System.out.println();
			}	
		}
		else
			System.out.println("Inorder to perform Matrix Addition, both the Matrices should have same number of rows and columns.");

	}

}
