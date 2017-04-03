package niitExamSamples;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = s.next().charAt(0);
		
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("The Given character is Vowel");
		else
			System.out.println("The Given character is Consonant");

	}

}
