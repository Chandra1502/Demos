import java.util.Scanner;
public class ExampleOfArray {
	public static void main(String a[]){
		int total = 0;
		int marks[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		for(int i=0;i<5;i++){
			marks[i]=s.nextInt();
		}	
		for(int i=0;i<5;i++){
			total = total+marks[i];
		}
		System.out.println("The Total marks are : "+total);
	}

}
 