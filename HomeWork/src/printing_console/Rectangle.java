

package printing_console;

public class Rectangle {
	
	public static void main(String[] args) {
		
// Declare Variables such as Length and Width		
		int length = 2;
		int  width = 2;
		
// Use Formulas:
		int perimeter = 2 * (length + width);
		int area = length * width;
		
// Calculate Perimetr and Area of Rectangle; Print it Out in Console
		System.out.println(
				"Perimeter of Rectangle" + " = " + perimeter + " \t"
			       + "Area of Rectangle" + " = " + area);	
		
		
// 2. Create a StringVariables firstName, lastName
		String	firstName = "Jamik"; 
		String   lastName = "Changretta";			 
		
// Concatinate Email with Domain Google
		String	domain = "@gmail.com";
		String email = firstName + lastName + domain;
		
// Print it Out
		System.out.println("email: " + email);

		
// 3. Exercise 1 for Cube 
		
		int a = 10;     // int "a" is a length 
		
		perimeter = 4 * a;
		area = a * a;
		
		System.out.println(
				"Perimeter of Square" + " = " + perimeter + " \t"
			       + "Area of Square" + " = " + area);
		
	}
}
