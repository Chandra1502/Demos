package niitExamSamples;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number which is to be the upper bound :");
		int n = s.nextInt();
		
	
		boolean b = true;
		

			for(int j=2;j<n;j++){
				if(n%j==0){
					b = false;
					break;}	
			}
			if(b)
				System.out.println("Is a prime number");
			else
				System.out.println("The Given number is not Prime");
			
			/*if(counter>=1)
				System.out.println("The Given number is Composite");
			else
				System.out.println("The Given number is Prime");*/
		
		
	}

}
