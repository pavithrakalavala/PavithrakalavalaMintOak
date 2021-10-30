package pagespackage;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.TestBase;
import utilitypackage.Utilityclass;

public class CompaniesPage extends TestBase{
	@FindBy(name="company_name")
	WebElement txtboxCompanyname;

	@FindBy(xpath = "//input[@placeholder='Enter Domain Name']")
	WebElement txtboxDomainName;
	
	@FindBy(xpath = "(//span[contains(text(),'Industry Type')])[1]/following-sibling::div")
	WebElement drpdwnIndustryType;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	WebElement DateOfIncorporation;
	
	@FindBy(xpath = "//td[@title='28/10/2021']")
	WebElement pickdate;
	
	@FindBy(xpath = "//button[normalize-space()='APPLY']")
	WebElement btnApply;
	
	
	@FindBy(xpath = "//input[@placeholder='Select Number of Employees']")
	WebElement drpdwnNumberOfEmployees;
	
	@FindBy(xpath="(//span[contains(text(),'Time Zone')])[1]/following-sibling::div")
	WebElement drpdwnTimeZone;
	
	@FindBy(name="tax_id")
	WebElement txtboxTaxID;
	
	@FindBy(xpath="(//span[contains(text(),'Currency')])[1]/following-sibling::div")
	WebElement drpdwnCurrency;
	

	@FindBy(name="about_company")
	WebElement txtboxAboutCompany;
	
	
	//Contact Information
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement chkboxAllowpublicDomain;
	
	@FindBy(name="primary_email")
	WebElement txtboxPrimaryEmail;
	
	@FindBy(xpath="//div[@name='select_domain']//input[@placeholder='Select Domain Name']")
	WebElement drpdwnDomainName;
	
	@FindBy(xpath="//span[@class='selected-tag'][normalize-space()='Domainname.com']")
	WebElement drpdwnprimaryemailDomainName;

	
	@FindBy(name="phone_number")
	WebElement txtboxPhoneNumber;
	
	//Branch1
	
	@FindBy(xpath="//input[@placeholder='Enter Branch Code']")
	WebElement txtboxBranchCode;
	
	@FindBy(xpath="//input[@placeholder='Enter Branch Name']")
	WebElement txtboxBranchname;
	
	@FindBy(xpath="//input[@placeholder='Enter Department Name']")
	WebElement txtboxDeptName;
	
	//Branch communication Information
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement txtboxBranchEmail;
	
	@FindBy(xpath="//input[@name='phone_number0']")
	WebElement txtboxBranchPhoneNum;
	
	@FindBy(xpath="//input[@placeholder='Enter Website']")
	WebElement txtboxBranchWebsite;
	
	@FindBy(xpath="//input[@value='Office' and @type='radio']")
	WebElement rdbtnBranchAddrType;
	
	@FindBy(xpath="//input[@placeholder='Enter Location']")
	WebElement rdbtnBranchlocation;
	
	@FindBy(xpath="//input[@placeholder='Enter Building Number']")
	WebElement txtboxBuildingNumber;
	
	@FindBy(xpath="//input[@placeholder='Enter Street 1']")
	WebElement txtboxStreet1;
	
	@FindBy(xpath="//input[@placeholder='Enter Street 2']")
	WebElement txtboxStreet2;
	
	@FindBy(xpath="//input[@placeholder='Enter City']")
	WebElement txtboxCity;
	
	@FindBy(xpath="//input[@placeholder='Enter Township']")
	WebElement txtboxTownship;
	
	@FindBy(xpath="//input[@placeholder='Enter State']")
	WebElement txtboxState;
	
	@FindBy(xpath="//input[@placeholder='Enter Zip Code']")
	WebElement txtboxZipcode;	
	
	@FindBy(xpath="(//span[contains(text(),'Country')])[1]/following-sibling::div")
	WebElement drpdwncountry;
	
	@FindBy(xpath="//input[@placeholder='Enter Location URL']")
	WebElement txtboxlocationURL;
	
	//Admin Information
	
	@FindBy(xpath="//input[@placeholder='Enter Admin Name']")
	WebElement txtboxAdminName;
	
	@FindBy(xpath="//input[@placeholder='Enter Admin Email']")
	WebElement txtboxAdminEmail;
	
	@FindBy(xpath="//input[@placeholder='Select Domain Name']")
	WebElement AdminEmaildomainname;
	
	
	@FindBy(xpath="//input[@placeholder='Select Branch Name']")
	WebElement drpdwnAdminBranchname;
	
	@FindBy(xpath="//input[@placeholder='Select Department']")
	WebElement drpdwnAdminDeptname;
	
	@FindBy(xpath="//input[@placeholder='Enter Admin Password']")
	WebElement txtboxAdminpwd;
	
	@FindBy(xpath="//button[normalize-space()='SAVE']")
	WebElement btnSave;	
	
	@FindBy(xpath="//button[normalize-space()='OK']")
	WebElement btnOK;
	
	@FindBy(xpath="//div[contains(text(),'Successfully Created Your Company')]")
	WebElement Successmsg;
	
	
	public CompaniesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean createcompany() throws InterruptedException
	{ 
		Random r = new Random();
		char date = (char)(r.nextInt(26) + 'a');
		txtboxCompanyname.sendKeys("companynameDigiCollectAssessment"+date);
		txtboxDomainName.sendKeys("Domainname"+date+".com");		
		drpdwnIndustryType.click();
		Thread.sleep(2000);		
		List<WebElement> allOptions = driver.findElements(By.xpath("//input[@placeholder='Select Industry Type']/parent::*/following-sibling::*/ul/li/span/span")); 
        for(int i = 0; i<=allOptions.size()-1; i++) {       
             
            if(allOptions.get(i).getText().contains("Accommodation and Food Services"))
            {                 
               allOptions.get(i).click();
               break;                 
            }
       }   

		DateOfIncorporation.click();
		pickdate.click();
		btnApply.click();		
		drpdwnNumberOfEmployees.click();		
		drpdwnNumberOfEmployees.sendKeys("1 - 4");		
		drpdwnNumberOfEmployees.sendKeys(Keys.ENTER);		
        drpdwnTimeZone.click();
        List<WebElement> Timezonelist = driver.findElements(By.xpath("(//span[contains(text(),'Time Zone')])[1]/following-sibling::div//ul/li/span/span"));
        for(int i = 0; i<=Timezonelist.size()-1; i++) {
             
         if(Timezonelist.get(i).getText().contains("(GMT-12:00) International Date Line West (Etc/GMT+12)")) {
          	Timezonelist.get(i).click();
             break;                 
            }
       }       
      
		txtboxTaxID.sendKeys("taxid");
		drpdwnCurrency.click();
		
		 List<WebElement> Currencylist = driver.findElements(By.xpath("(//span[contains(text(),'Currency')])[1]/following-sibling::div//ul/li/span/span"));
	     for(int i = 0; i<=Currencylist.size()-1; i++) {
	             
           if(Currencylist.get(i).getText().contains("JPY(¥)"))
           {	                 
	            Currencylist.get(i).click();
	             break;	                 
	            }
	       }     
	        
		txtboxAboutCompany.sendKeys("abtcompany");		
		//Contact Information	
		chkboxAllowpublicDomain.click();
		txtboxPrimaryEmail.sendKeys("pavithra");	
		drpdwnDomainName.click();		  
		drpdwnDomainName.sendKeys(Keys.ENTER);		
		txtboxPhoneNumber.sendKeys("9449967456");
		
		//Branch1
		txtboxBranchCode.sendKeys("9876544");
		txtboxBranchname.sendKeys("Branchname");
		txtboxDeptName.sendKeys("deptname");
		txtboxBranchEmail.sendKeys("branch@gmail.com");
		txtboxBranchPhoneNum.sendKeys("9611490077");
		txtboxBranchWebsite.sendKeys("https://www.google.com");		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",rdbtnBranchAddrType);		
		rdbtnBranchlocation.sendKeys("Branson, MO 65616, USA");
		Thread.sleep(1000);
		rdbtnBranchlocation.sendKeys(Keys.DOWN);	    
	    txtboxAdminName.sendKeys("Admin Name");
	    txtboxAdminEmail.sendKeys("AdminEmail");
	    AdminEmaildomainname.click();	  
		AdminEmaildomainname.sendKeys(Keys.ENTER);	
	    drpdwnAdminBranchname.click();	 
	    drpdwnAdminBranchname.sendKeys("Branchname");	
	    drpdwnAdminBranchname.sendKeys(Keys.ENTER);	   
	    drpdwnAdminDeptname.click();
	    drpdwnAdminDeptname.sendKeys("deptname");	   
	    drpdwnAdminDeptname.sendKeys(Keys.ENTER);	  		 
	    txtboxAdminpwd.sendKeys("AdminPwd@123");
		btnSave.click();
		Thread.sleep(1000);
		boolean msg=Successmsg.isDisplayed();
		System.out.println(msg);
		
		return(msg);
		
		
		
	}
	
}
