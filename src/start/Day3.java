package start;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void WebLoginLoan() {
		System.out.println("yoeeeee");
	}

	@Test(groups= {"smoke"})
	public void MobileLoginLoan() {
		System.out.println("yosss");
	}
	@AfterTest
	public void After(){
		System.out.println("Print my class After");
	}
	@Test
	public void ApiLoginLoan() {
		System.out.println("yoqqqqq");
	}
	
}
