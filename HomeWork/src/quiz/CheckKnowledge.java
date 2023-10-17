
package quiz;

public class CheckKnowledge {

	public static void main(String[] args) {

// Create a program that converts a name into Initials
// The Output should be 2 capital letters with a dot separating them.
		
		String name = "Alexander Greenspan";
//Tom Smith or Alexander Greenspan		

		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				System.out.print(name.charAt(i));
			}
			if (name.charAt(i) == ' ') {
				System.out.print('.');
			}
			int indexOfFirstLetterOfLastname = name.indexOf(' ') + 1;
			if (i == indexOfFirstLetterOfLastname) {
				System.out.print(name.charAt(i));
				break;
			}
		}
		

	}

}
