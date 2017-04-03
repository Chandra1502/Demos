package niitExamSamples;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = s.nextInt();
		
		if(year%4==0&&year%100!=0)
			System.out.println("The given is a leap year");
		else if(year%4==0&&year%400==0)
			System.out.println("The given is a leap year");
		else
			System.out.println("The given year is not a leap year");
			
		
	}

}
