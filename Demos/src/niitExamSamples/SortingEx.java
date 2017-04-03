package niitExamSamples;

import java.util.Scanner;

public class SortingEx {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		System.out.println("Enter the numbers into the array : ");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i] = s.nextInt();
		}
		
		int n = a.length, temp=0;
		
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(a[j-1]>a[j]){
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" "
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					);
		}

	}

}
