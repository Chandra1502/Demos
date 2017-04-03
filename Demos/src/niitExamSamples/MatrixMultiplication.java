package niitExamSamples;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String a[]){

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the number of rows and columns for Matrix 1:");
	int r1 = s.nextInt();
	int c1 = s.nextInt();
	
	System.out.println("Enter the number of rows and columns for Matrix 2:");
	int r2 = s.nextInt();
	int c2 = s.nextInt();
	
	int M1[][] = new int[r1][c1];
	int M2[][] = new int[r2][c2];
	
	if(c1==r2){
		
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
		
		int result[][] = new int[r1][c2];
		
		int temp = 0;
		
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<r2;k++){
					temp = temp+ M1[i][k]*M2[k][j]; 
				}
				result[i][j] = temp;
				temp = 0;
			}
		}
		
		System.out.println("Resultant Matrix :");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
	else
		System.out.println("Inorder to perform Matrix Multiplication, the no of columns of 1st Matrix should be equal to no of rows of second Matrix");
	}
}
