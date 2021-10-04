package testpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.TestBase;
import pagespackage.Homepage;
import pagespackage.Loginpage;


public class HomePageTest extends TestBase {
	Loginpage loginpage;
	Homepage homepage;	
	LoginPageTest loginpagetest;

public HomePageTest()
{
	super();
}

@BeforeMethod
public void setup() throws InterruptedException
{
	initialization();	
	loginpage=new Loginpage();
	homepage=new Homepage();
	
	/*
	 * homepage.NavigateToSignInPage(); String title=loginpage.LoginpageTitle();
	 * Assert.assertEquals(title, "Amazon Sign-In",
	 * "Sign-in page title not matching");
	 * homepage=loginpage.Login(prop.getProperty("Email"),prop.getProperty(
	 * "Password")); String accountname=homepage.verifyusername();
	 * Assert.assertEquals(accountname,"Hello, pavithra"
	 * ,"Login Accountname doesnt match");
	 */
	
	
	
}

/*
 * @Test(priority=1) public void VerifyHomepageTitleTest() {
 * System.out.println("Login"); String
 * homepagetitle=homepage.VerifyHomePageTitle();
 * Assert.assertEquals(homepagetitle,
 * "Amazon.com. Spend less. Smile more.","Home page title not mattching");
 * 
 * }
 */

@Test
public void VerifyProductAdded() throws InterruptedException, IOException
{ 	
	
	homepage.SearchAndFindProduct();
	//String homepagetitle=homepage.VerifyHomePageTitle();	
	//Assert.assertEquals(homepagetitle, "Amazon.com. Spend less. Smile more.","Home page title not mattching");
	
}



/*
 * @AfterMethod public void teardown() { driver.quit(); }
 */


}