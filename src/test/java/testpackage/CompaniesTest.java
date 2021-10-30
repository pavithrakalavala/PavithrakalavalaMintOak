package testpackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.TestBase;
import pagespackage.CompaniesPage;
import pagespackage.Homepage;
import pagespackage.Loginpage;

public class CompaniesTest extends TestBase{
	Loginpage loginpage;
	Homepage homepage;
	CompaniesPage companiespage;
	
	public CompaniesTest()
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
		companiespage=new CompaniesPage();
				
	}
	
	@Test
	public void createnewcompany() throws InterruptedException
	{	
		
		
		homepage=loginpage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
		homepage.selectCompaniestab();
		boolean createdmsg=companiespage.createcompany();
		Assert.assertEquals(createdmsg, true);
		
		
	}


}
