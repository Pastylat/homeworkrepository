

package printing_console;

public class MiamiTrip {
	
	public static void main(String[] args) {
		
// 4. Create a Class that calculate Total cost of a Round Trip 
		int	distanceToMiami = 1000;
		int  milesPerGallon = 20;
		double     gasPrice = 4.21;
		double  foodExpance = 325.35;
		double        hotel = 255.21;
		
double onewayExp = (distanceToMiami / milesPerGallon) * gasPrice + foodExpance + hotel;
		
		System.out.println("RoundTrip Total" + " = " + onewayExp * 2);

		
		// Assuming you are staying 2 nights in Miami
				
// 4.1 Print out all variables
		double first = distanceToMiami + milesPerGallon + gasPrice + foodExpance + hotel;
		double firstOne = foodExpance + hotel; 	
			
		System.out.println("First Night" + " = " + first);
		System.out.println("Second Night" + " = " + firstOne);
				
// 4.2 Calculate OneWay expances NY-Miami
				
		System.out.println("OneWay Expances" + " = " + onewayExp);
				
// 4.3 Calculate Total expances
		double third = onewayExp * 2;
			
		System.out.println("Total for 2 Nights" + " = " + third);
		
	}

}
