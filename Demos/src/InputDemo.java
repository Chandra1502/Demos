import java.io.*;
public class InputDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("Enter the Employee ID : ");
		 int eid = Integer.parseInt(br.readLine());
		 
		 System.out.println("Enter sex M/F ");
		 char ch = br.readLine().charAt(0);
		 
		 System.out.println("Enter the Employee name : ");
		 String str = br.readLine();
		 
		 System.out.println("The detials of the Employee are : "+"\n"+"Employee ID : "+eid+"\n"+"Employee sex : "+ch+"\n"+"Employee name : "+str);

	}

}
