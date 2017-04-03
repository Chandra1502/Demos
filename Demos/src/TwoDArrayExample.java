import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns :");
		int r = s.nextInt();
		int c = s.nextInt();
		
		//creating an array with and allocating the memory to it
		int a[][] = new int[r][c];
		
		//Giving inputs to the array
		for(int i=0;i<r;i++){
			System.out.println("Enter the inputs for row "+(i+1)+" :");
			for(int j=0;j<c;j++){
				a[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Array Lenght: "+a.length);
		
		//Creating the matrix for the given input
		System.out.println("The given matrix is :");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		//Transpose of the matrix
		System.out.println("The Transpose of the given matrix is :");
		for(int j=0;j<c;j++){
			for(int i=0;i<r;i++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
