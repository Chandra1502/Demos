package niitExamSamples;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		int sum = 0, num=n;
		while(num>0){
			int r = num%10;
			num = num/10;
			sum = sum+r;
		}
		
			System.out.println("The sum of digits of "+n+" is :"+sum);
	}

}
