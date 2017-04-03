package niitExamSamples;

import java.util.Scanner;

public class BiggestExample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the three numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>b&&a>c)
			System.out.println("The biggest number is : "+a);
		else if(b>a&&b>c)
			System.out.println("The biggest number is : "+b);
		else if(c>a&&c>b)
			System.out.println("The biggest number is : "+c);
		else
			System.out.println("Invalid");
	}

}
