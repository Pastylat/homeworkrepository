

package control_flow;

public class Q5CountingAndBreakingLoop {

	public static void main(String[] args) {
		
// Print all 'charS' from the following String myGoal=
		String myGoal = "Success is not final, failure is not fatal: It is the courage to continue that counts.";
		
		for(int ind = 0; ind < myGoal.length(); ind++) {
			System.out.println(myGoal.charAt(ind));
		}
		
// Break the loop when printing only "Success is not final, failure is not fatal"
		
		for(int ind = 0; ind < myGoal.length(); ind++) {
			System.out.println("\t" + myGoal.charAt(ind));			
			if (myGoal.charAt(ind) == 'l' && ind == 41) {
				break;
			}
						
		}
		
	}

}
