package testpackage;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.TestBase;
import pagespackage.Homepage;
import pagespackage.Loginpage;

public class LoginPageTest extends TestBase {
	Loginpage loginpage;
	Homepage homepage;
	
	public LoginPageTest()
	{
		super();//this keyword calls TestBase cons having properties 
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		loginpage=new Loginpage();
		homepage=new Homepage();
				
	}
	
	@Test(priority=1)
	public void LoginAndvalidateLoginAccount() throws InterruptedException
	{	
		homepage.NavigateToSignInPage();	
		String title=loginpage.LoginpageTitle();
		Assert.assertEquals(title, "Amazon Sign-In", "Sign-in page title not matching");
		homepage=loginpage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
		String accountname=homepage.verifyusername();
		Assert.assertEquals(accountname,"Hello, pavithra","Login Accountname doesnt match");
		
		
	}

	
	
	

}
