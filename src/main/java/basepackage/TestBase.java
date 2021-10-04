package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			
			FileInputStream in=new FileInputStream("C:\\NewWorkspace\\AssessmentMintOak\\src\\main\\java\\configpackage\\config.properties");
			prop.load(in);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("Chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "C:/NewWorkspace/AssessmentMintOak/jarfiles/chromedriver_win32/chromedriver.exe");
			 driver=new ChromeDriver();
				}
		else
			if(browsername.equals("FF"))
					{
				System.setProperty("webdriver.gecko.driver", "C:/NewWorkspace/AssessmentMintOak/jarfiles/geckodriver-v0.29.1-win64/geckodriver.exe");
				driver=new FirefoxDriver();
					}
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
		
		
			
	}
	
}
	

	


