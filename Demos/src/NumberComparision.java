import java.io.*;
import java.util.StringTokenizer;

public class NumberComparision {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the 3 numbers : ");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		
		if(a>b&&a>c)
			System.out.println(a+" is the biggest number");
		else if(c>b&&c>a)
			System.out.println(c+" is the biggest number");
		else if(b>a&&b>c)
			System.out.println(b+" is the biggest number");
		else
			System.out.println("Given numbers are not distinct");
		
	
	}

}
