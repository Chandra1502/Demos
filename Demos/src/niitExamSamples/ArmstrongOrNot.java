package niitExamSamples;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		
		int sum ;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int m = s.nextInt();
		System.out.println("Enter the end number : ");
		int n = s.nextInt();
		
		for(int i=m;i<=n;i++){
		sum=0;	
		int j=i;	
		while(j>0){
			int r = j%10;
			j = j/10;
			sum = sum + (r*r*r);
		}
		if(sum==i)
			System.out.println(i+" is an Armstrong");
		}
	}

}
