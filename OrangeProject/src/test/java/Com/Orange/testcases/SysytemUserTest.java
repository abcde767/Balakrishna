package Com.Orange.testcases;

import org.testng.Assert;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;

public class SysytemUserTest extends BaseClass {
	
	 HomePage HomePage;

	public void loginTest() throws InterruptedException
	{
		 HomePage = loginpage.login();
		String expUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actUrl = driver.getCurrentUrl();
		Assert.assertEquals(actUrl, expUrl);
		System.out.println("loginTest is passed");
	}

}
