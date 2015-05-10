package test;

import org.testng.annotations.Test;

public class FirstTest {

	
	@Test(priority=1)
	public void TestApp(){
	System.out.println("this is the first TestNg");
		
	}
	@Test(priority=2)
	public void LoginTest(){
		System.out.println("login test");
	}
	
	@Test(priority =3)
	public void LogoutTest(){
		System.out.println("logout test");
	}
}
