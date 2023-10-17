

package test_ng;

import org.testng.annotations.Test;

public class GroupDemo {
	
	@Test(groups="hello")
	public void method1() {
		System.out.println("Running method1");
	}
	
	@Test(groups="hello")
	public void method2() {
		System.out.println("Running method2");
	}
	
	@Test(groups="bye")
	public void method3() {
		System.out.println("Running method3");
	}
	
	@Test(groups={"hello", "bye", "hi"})
	public void method4() {
		System.out.println("Running method4");
	}
	
	@Test(groups={"hello", "bye", "hi"})
	public void method5() {
		System.out.println("Running method5");
	}
	
	@Test()
	public void method6() {
		System.out.println("Running method6");
	}
	
}
