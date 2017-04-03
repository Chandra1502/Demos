import java.io.*;
import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Employee's Name, Age, Sex, Salary : ");
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str,",");
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		
		//This trim() is used to remove the spaces before and after the String
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		s4 = s4.trim();
		
		
		
		String Name = s1;
		int Age = Integer.parseInt(s2);
		char Sex = s3.charAt(0);
		double Salary = Double.parseDouble(s4);
		
		System.out.println("The details of the Employee are :"+"\n"+"Name : "+Name+"\n"+"Age : "+Age+"\n"+"Sex : "+Sex+"\n"+"Salary : "+Salary);
		
	}

}
