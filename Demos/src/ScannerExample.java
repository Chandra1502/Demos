import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		int i = sc.nextInt();
		String s = sc.nextLine();
		double d = sc.nextDouble();
		
		System.out.println("The result is :"+i+ s+ d);
		
	}

}
