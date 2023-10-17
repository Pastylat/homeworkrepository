

package quiz;

public class BackLoopCounter {
	
	public static void main(String[] args) {

// back counter
		String var1 = "I love cars";

		for (int l = var1.length() - 1; l >= 0; l--) {
			System.out.print(var1.charAt(l));
		}
		
	}
	
}
