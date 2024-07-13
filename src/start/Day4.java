package start;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	@AfterClass
	public void After(){
		System.out.println("Print my class after");
	}
	@BeforeMethod
	public void Before1(){
		System.out.println("Print my Method Before");
	}
	@Test
	public void WebHomeLoan() {
		System.out.println("yohh");
	}

	@Test(groups={"smoke"})
	public void MobileHomeLoan() {
		System.out.println("yohh yes");
	}

	@Test(groups={"smoke"})
	public void ApiHomeLoan() {
		System.out.println("yohh no");
	}
	@BeforeClass
	public void Before(){
		System.out.println("Print my class Before");
	}
}
