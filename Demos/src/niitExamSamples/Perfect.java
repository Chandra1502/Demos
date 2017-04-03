package niitExamSamples;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Start Number : ");
		int m = s.nextInt();
		System.out.print("Enter the End Number : ");
		int n = s.nextInt();
		
		int sum;
		
		System.out.println("The perfect numbers from "+m+" to "+n+" are :");
		
		for(int i=m; i<=n ; i++)
		{
			sum = 0;
			for(int j =1; j<i ;j++)
			{
				
				if(i%j==0)
				{
					sum = sum + j;
				}
			}
			if(sum == i)
				System.out.println(i);
		}

	}

}
