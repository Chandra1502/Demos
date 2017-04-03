import java.util.Scanner;
public class HighestScore {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numOfStudents = input.nextInt();
	        
	        input.nextLine();

	        System.out.print("Enter a student's name: ");
	        String student1 = input.nextLine();

	        System.out.print("Enter that student's score: ");
	        int score1 = input.nextInt();

	        for (int i = 0; i <= numOfStudents - 1; i++) {

	            System.out.println("Enter a student's name: ");
	            String student = input.nextLine();
	            
	            input.nextLine();
	            
	            System.out.println("Enter that student's score: ");
	            int score = input.nextInt();

	            if (score > score1) {
	            student1 = student;
	            score1 = score;
	            }
	        }
	        System.out.println("Top student " +
	        student1 + "'s score is " + score1);
	    }
}
	
	
	
	
	


