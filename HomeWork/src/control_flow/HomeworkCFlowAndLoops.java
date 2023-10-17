package control_flow;

public class HomeworkCFlowAndLoops {

	public static void discountCalculator(Double totalCost) {
		/*
		 * Q1 Create a program for a store that calculates the total cost of items in a
		 * shopping cart. The program should apply different discounts based on the
		 * total cost:
		 * 
		 * 10% discount if the total cost is between $300 and $399.99 15% discount if
		 * the total cost is between $400 and $499.99 20% discount if the total cost is
		 * $500 or more No discount if the total cost is less than $300
		 */

		double costAfterDiscount = 0;
		
		//percent var
		double discountTenPercent = 0.1; // in decimal
		double discountFifteenPercent = 0.15; // in decimal
		double discountTwentyPercent = 0.2; // in decimal
		double currentDiscount = 0;
		
		//boundaries var
		int boundaryOne = 300;
		int boundaryTwo = 400;
		int boundaryThree = 500;
		
		if(totalCost < boundaryOne) {
			currentDiscount = 0;
			costAfterDiscount = totalCost;
			System.out.println("Total Cost " + costAfterDiscount + " and discount is " + currentDiscount);
		} else if(totalCost >= boundaryOne && totalCost < boundaryTwo) {
			currentDiscount = totalCost * discountTenPercent;
			costAfterDiscount = totalCost - currentDiscount;
			System.out.println("Total Cost " + costAfterDiscount + " and discount is " + currentDiscount);
		} else if(totalCost >= boundaryTwo && totalCost < boundaryThree) {
			currentDiscount = totalCost * discountFifteenPercent;
			costAfterDiscount = totalCost - currentDiscount;
			System.out.println("Total Cost " + costAfterDiscount + " and discount is " + currentDiscount);
		} else {
			currentDiscount = totalCost * discountTwentyPercent;
			costAfterDiscount = totalCost - currentDiscount;
			System.out.println("Total Cost " + costAfterDiscount + " and discount is " + currentDiscount);
		}
		
	}
	
	public static void calculateStudentGrade(int studentScore) {
//		Write a Java program that takes a student's score as input
//		and prints their grade based on the following grading scale:
//
//		90-100: A
//		80-89: B
//		70-79: C
//		60-69: D
//		Below 60: F
		
		if(studentScore > 89 && studentScore <= 100) {
			System.out.println("The student score is " + studentScore + " which is A");
		} else if(studentScore <= 89 && studentScore > 79) {
			System.out.println("The student score is " + studentScore + " which is B");
		} else if(studentScore <= 79 && studentScore > 69) {
			System.out.println("The student score is " + studentScore + " which is C");
		} else if(studentScore <= 69 && studentScore >= 60) {
			System.out.println("The student score is " + studentScore + " which is D");
		} else if(studentScore < 60 && studentScore > 0) {
			System.out.println("The student score is " + studentScore + " which is F");
		} else {
			System.out.println("Invalid Studen Score");
		}
	}
	
	public static void numberType(int number) {
		
//		Q3
//		Create a program that reads an integer and determines whether 
//		it's positive, negative, or zero. Print the result.
		
		if(number < 0) {
			System.out.println("Number : " + number + " is negative!");
		} else if(number == 0) {
			System.out.println("Number : " + number + " is zero");
		} else {
			System.out.println("Number: " + number + " is positve!");
		}
	}
	
	public static void print1to10() {
		// Q4 Write a Java program that uses a  loop to print numbers from 1 to 10.
		
		int number = 1;
		
		while (number <= 10) {
			System.out.println(number);
			number = number +1;
		}
	}
	
	public static void printAllCharacter() {
//		Q5
//		Print all characters from the following 
//		String myGoal = "Success is not final, failure is not fatal: It is the courage to continue that counts."
		String myGoal = "Success is not final, failure is not fatal: It is the courage to continue that counts.";
		
		for (int i = 0; i < myGoal.length(); i++) {
			System.out.println(myGoal.charAt(i));
		}
	}
	
	public static void printPartially() {
//		Q5.1
//		Break the loop when printing only "Success is not final, failure is not fatal" from above String myGoal.
		String myGoal = "Success is not final, failure is not fatal: It is the courage to continue that counts.";
		
		for (int i = 0; i < myGoal.length(); i++) {
			if(myGoal.charAt(i) == ':') {
				break;
			}
			System.out.println(myGoal.charAt(i));

		}
	}
	
	public static void calculateSumFrom1To50() {		
//		Write a Java program that calculates and prints the sum of numbers from 1 to 50.
		
		int sum = 0;
		
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;

		}
		
		System.out.println(" sum from 1 to 50 is  " + sum);
	}
	
	public static void printOnlyEvenNumbersFrom1to20() {
//		Create a Java program that uses a loop to print even numbers from 1 to 20.	

		
		for (int i = 2; i <= 20 ; i=i+2) {
			System.out.println(i);
		}
	}

}
