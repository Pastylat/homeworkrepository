

package control_flow;

public class Q1DiscountCalculator {
	
	public static void main(String[] args) {
		
// Create a program for the Store that calculates Total cost of items and apply them for different Discounts.

// Create a Program
		
		double totalCost29 = 299.99;
		
		int totalCost30 = 300;
		double totalCost39 = 399.99;
			
		int totalCost40 = 400;
		double totalCost49 = 499.99;
			
		int totalCost50 = 500;
		
			
// The program should apply different Discounts based on the Total Cost:
			
		System.out.println("If the total cost less than: " + totalCost30);
		
		if(totalCost29 >= totalCost30 && totalCost29 == totalCost39) { //false AND false
			//skip the code
		}
		else if (totalCost29 > totalCost30 && totalCost29 < totalCost39) { //false AND true
		//skip
		}
		else if (totalCost29 != totalCost39 && totalCost29 == totalCost30) { //true AND false
		//skip	
		} 
		else if (totalCost29 < totalCost30 && totalCost29 != totalCost39) {
			System.out.println("\tNo Discount Included: " + "Suggest \"Hot Sales\" items");
		}
		else {
			System.out.println("\tError, 2coditions are not matched"); //skip
		}
		
// Range between $300 and $399.99 (Include 10% Discount)
		
		System.out.println("\rIf the total cost between: " + totalCost30 + " and " + totalCost39);
		
		if (totalCost30 >= totalCost39 && totalCost30 <= totalCost50 ) {	
		//skip the code here	
		}
		else if (totalCost30 < totalCost39 && totalCost30 == totalCost50) {	
		//
		}
		else if (totalCost30 != totalCost39 && totalCost30 < totalCost50) {
			System.out.println("\tInclude 10% Discount");
		}
		else {
			System.out.println("\tError, 2conditions are not matched"); //
		}
		
// Range between $400 and $499.99 (Include 15% Discount) ('or' operator)
		
		System.out.println("\rIf the total cost between: " + totalCost40 + " and " + totalCost49);
		
		if (totalCost39 > totalCost40 || totalCost49 > totalCost50) {
		//
		}
		else if (totalCost49 == totalCost40 || totalCost39 == totalCost50) {
		//	
		}
		else if (totalCost40 != totalCost49 || totalCost49 < totalCost50) {
			System.out.println("\tInclude 15% Discount");
		}
		else {
			System.out.println("\tError, check the condition");
		}
		
// Range $500 or More (Include 20% Discount) ('or' operator) 
		
		System.out.println("\rIf the total cost is: " + totalCost50 + " or above");
		
		if (totalCost50 < totalCost29 || totalCost49 < totalCost39) {
			System.out.println("\tError");
		}
		else {
			System.out.println("\tInclude 20% Discount");
		}
		
		
	}
	
}
