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
}



  @AfterMethod public void teardown()
  { 
	  driver.quit();
  }



}