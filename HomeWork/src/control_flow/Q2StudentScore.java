

package control_flow;

public class Q2StudentScore {
	
	public static void main(String[] args) {
		
// Create a Java program that takes a Student's score as Input and 
// prints their Grade based on the following grading scale:	
//	   90-100:  A
//		80-89:  B
//		70-79:  C
//		60-69:  D
//	 Below 60:  F
		
		int score = 90;
		
		if (score > 100 || score >= 90) { 
			System.out.println("Student's score is: A");
		}
		else if (score < 90 && score >= 80) {
			System.out.println("Student's score is: B");
		}
		else if (score < 80 && score >= 70) {
			System.out.println("Student's score is: C");
		}
		else if (score < 70 && score >= 60) {
			System.out.println("Student's score is: D");
		}
		else if (score < 60) {
			System.out.println("Student's score is: F");
		}
		else {
			System.out.println("error = Logick/Operators");
		}		
		
		
	}
	
}
