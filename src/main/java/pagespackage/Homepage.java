package pagespackage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basepackage.TestBase;
import utilitypackage.Utilityclass;

public class Homepage extends TestBase {
	

	// home page
	@FindBy(xpath = "//span[normalize-space()='Companies']")
	WebElement tabCompanies;

	@FindBy(linkText="+ Create New")
	WebElement linkCreateNew;

	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String VerifyHomePageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void selectCompaniestab() throws InterruptedException
	{
		Thread.sleep(2000);
		tabCompanies.click();
		linkCreateNew.click();
		
	}

	

	
}
