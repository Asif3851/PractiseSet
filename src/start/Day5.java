package start;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day5 {
	@Test(enabled = false)
	public void A() {
		System.out.println("I am A");
	}

	@Parameters({"URL","APP"})				//Important----> Parameters
	@Test
	public void E(String url,String app) {
		System.out.println("I am E");
		System.out.println(url);
		System.out.println(app);
	}

	@Test(dataProvider="getData")
	public void D(String username, String pass) {
		System.out.println("I am D");
		System.out.println(username);
		System.out.println(pass);
	}

	@Test(timeOut = 4000)
	public void C() {
		System.out.println("I am C");
	}

	@Test(dependsOnMethods = { "C","D" })
	public void B() {
		System.out.println("I am B");
	}
	@DataProvider								// Important Topic DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		//1st
		data[0][0] = "Asif01";
		data[0][1] = "paas01";
		//2st
		data[1][0] = "Asif02";
		data[1][1] = "paas02";
		//3st
		data[2][0] = "Asif03";
		data[2][1] = "paas03";
		return data;
	}
}

//Helper attribute
//1) @Test(dependsOnMethods={"method1","method2",...})
//2) @Test(enabled=false)
//3) @Test(timeOut=4000)
