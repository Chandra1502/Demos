import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which the factorial is to be found :");
		int n = s.nextInt();
		
		if(n==0)
			System.out.println("The Factorrial of given number "+n+" is : 0"); 
		else if(n>0)
		{
			for(int i=1; i<=n ; i++)
				fact = fact*i;
			System.out.println("The Factorrial of given number "+n+" is :"+ fact);
		}
		else
			System.out.println("Invalid Input");
	}

}
