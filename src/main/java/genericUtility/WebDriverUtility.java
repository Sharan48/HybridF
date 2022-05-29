package genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	//timewaitImp
	public void waituntilPageload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//timeExplt
	public void waitForElmVsbl(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Select
	public void dropDownVal(WebElement element, String value)
	{
		Select Ks=new Select(element);
		Ks.selectByValue(value);
	}
	public void dropoDownVsblTxt(WebElement element, String option)
	{
		Select ks1=new Select(element);
		ks1.selectByVisibleText(option);
	}
	public void dropDownIndx(WebElement element, int index)
	{
		Select ks2=new Select(element);
		ks2.selectByIndex(index);
	}

	//PopUp
	public void popUp(WebDriver driver, String value)
	{
		Alert aLt = driver.switchTo().alert();
		aLt.sendKeys(value);

	}
	public void popUpAccpt(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void popUpDismss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void popUpgetTxt(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}

	//child browser
	public void windHandl(WebDriver driver, String value)
	{
		Set<String> wInd = driver.getWindowHandles();
		Iterator<String> it = wInd.iterator();
		while(it.hasNext())
		{
			String windl = it.next();
			String title = driver.switchTo().window(windl).getTitle();
			if(title.contains(value))
			{
				break;
			}
		}
	}
	//Frame
	public void switchframe(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchManFrm(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void switchFrm2Prnt(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	public void switchFrm3indx(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	//Scroll
	public void scrollWebele(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}
	//Actions
	public void mouseover(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void douBleClick(WebDriver driver, WebElement element)
	{
		Actions act1=new Actions(driver);
		act1.doubleClick(element).perform();
	}
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions act3=new Actions(driver);
		act3.contextClick(element).perform();
	}
	public void screenShot(WebDriver driver, String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+screenshotName+".PNG");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}


}
