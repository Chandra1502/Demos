package niitExamSamples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		
		System.out.println("The Even numbers are : ");
		for(int i=1;i<n;i++){
			if(i%2==0)
				System.out.println(i);
		}	
	}

}
