
public class Prime {

	public static void main(String[] args) {
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not :");
		int n = s.nextInt();
		
		if(n>2)
		{
			if(n%n==0&&n%1==0&&n%2==0&&n%3==0&&n%5==0&&n%7==0)
				System.out.println("The given number is not a prime number");
			else
				System.out.println("The given number is a prime number");
		}

	}

}
