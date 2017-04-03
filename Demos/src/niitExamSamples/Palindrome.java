package niitExamSamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int start = s.nextInt();
		System.out.println("Enter the end number : ");
		int end = s.nextInt();
		
		int sum;
		for(int i=start;i<=end;i++){
		int j = i;	sum =0;
		while(j>0)
		{
			int r = j%10;
			sum = sum*10 +r;
			j = j/10;
		}
		if(i==sum)
			System.out.println("Palindrome : "+i);
		}
	}

}
