package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Homepage;
import pom.LoginPage;

public class Baseclass {
	public WebDriver driver;
	public WebDriverUtility wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();
	public FileUtility fUit=new FileUtility();
	public ExcelUtility eXcel=new ExcelUtility();
	
	String USERNAME;
	String PASSWORD;
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS()
	{
		System.out.println("data base connection started");
	}
	
	@Parameters("browser")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void configBc() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Property.properties");
		Properties pt=new Properties();
		pt.load(fis);
		 String Browser = pt.getProperty("browser");
		 String URL = pt.getProperty("url");
		  USERNAME = pt.getProperty("username");
		 PASSWORD = pt.getProperty("password");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} 
		wLib.waituntilPageload(driver);
		System.out.println("browser launched");
		driver.get(URL);
		
		driver.manage().window().maximize();
	}

	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void confiBM()
	{
		System.out.println("successful logged");

		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		
//		lp.getUsernametxtfld().sendKeys(USERNAME);
//		lp.getPasswordtxtfld().sendKeys(PASSWORD);
//		lp.getLoginbtn().click();
		//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//		driver.findElement(By.xpath("//a[.='Login ']")).click();
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM()
	{
		System.out.println("successful log out");
		Homepage hp=new Homepage(driver);
//		hp.getLgutbtn().click();
		//		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC()
	{
		System.out.println("browser closed");
//	     driver.close();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS()
	{
		System.out.println("data base connection closed");

	}


}
