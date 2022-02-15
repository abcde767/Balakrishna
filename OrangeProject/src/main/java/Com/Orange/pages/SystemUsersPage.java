package Com.Orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Orange.base.BaseClass;

public class SystemUsersPage extends BaseClass {
	 @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	  WebElement admin;
	  
	/* @FindBy(xpath = "@FindBy(xpath = \"//input[@id='searchBtn']\")\r\n"
		  		+ "	  WebElement searchbtn;")
		  WebElement systemusers;*/
	
	 
	  @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	  WebElement username;
	  
	  @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
	  WebElement userole;
	  
	  @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
	
	  WebElement employename;
	  
	  @FindBy(xpath = "//select[@id='searchSystemUser_status']")
	  WebElement status;
	  
	  @FindBy(xpath = "//input[@id='searchBtn']")
	  WebElement searchbtn;
	  
	  
	  
	  public SystemUsersPage()
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	 
	  
	  public SystemUsersPage login() throws InterruptedException
	  {
		  admin.click();
		 
		  Thread.sleep(1000);
		  
		  username.sendKeys("adash");
		  Thread.sleep(1000);
		
		  userole.sendKeys("ESS");
		  Thread.sleep(1000);
		  employename.sendKeys("Ananya Dash");
		  Thread.sleep(1000);
		  status.sendKeys("Enabled");
		  Thread.sleep(1000);
		  searchbtn.click();
		  
		  return new AddPage();
	  }
	
}