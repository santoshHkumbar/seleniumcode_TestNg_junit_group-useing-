package Group_diffrentxmlfile;




import org.testng.annotations.Test;



public class groups {



	@Test(priority = 1,groups = {"functional1"})
	public void tc1() {
		
		System.out.println("it my first functional1 test method");
	}
	@Test(priority = 2,groups = {"functional1"})
	public void tc2() {
		System.out.println("it my second functional1 test method");
	}
	@Test(priority = 1,groups = {"smoke"})
	public void tc3() {
		System.out.println("it my first smoke test method");
	}
	@Test(priority = 1,groups = {"smoke"})
	public void tc4() {
		System.out.println("it my second smoke test method");
	}
}
