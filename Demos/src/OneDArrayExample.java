import java.util.Scanner;

public class OneDArrayExample {
	public static void main(String args[]){
		int total=0;
		float percentage;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the total number of Subjects :");
		int i = s.nextInt();
		
		int marks[] = new int[i];
		System.out.println("Enter the marks of each Subject :");
		for(int n=0;n<i;n++){
			marks[n] = s.nextInt();
		}
		for(int a=0;a<i;a++){
			total = total+marks[a];
		}
		System.out.println("The total marks are :"+total);
		percentage = (float) total/i;
		System.out.println("The percentage of marks are :"+percentage);
	}
}
