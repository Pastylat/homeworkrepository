

package testng_controlflow;

import org.testng.annotations.*;

public class HelloHiBye {
	
// Create 6 simple methods
	
	@Test(groups="hello")
	public void methodHelloOne() {
		System.out.println("method HelloOne");
	}
	
	@Test(groups="hello")
	public void methodHelloTwo() {
		System.out.println("method HelloTwo");
	} 
	
	@Test(groups= {"hello", "hi"})
	public void methodHelloHi() {
		System.out.println("method HelloHi");
	} 
	
	@Test(groups= {"hello", "hi", "bye"})
	public void methodHelloHiBye() {
		System.out.println("method HelloHiBye");
	} 
	
	@Test(groups= {"hi", "bye"})
	public void methodHiBye() {
		System.out.println("method HiBye");
	}
	
	@Test
	public void methodNeither() {
		System.out.println("method Neither");
	}
	
}
