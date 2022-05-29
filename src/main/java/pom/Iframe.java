package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iframe 
{

	@FindBy(xpath = "//a[.='New']")
	private WebElement newWnd;

	@FindBy(xpath = "//iframe[@id='editDescriptionPopupIframe']")
	private WebElement iFreame;


	public Iframe(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getiFreame() {
		return iFreame;
	}


	public WebElement getNewWnd() {
		return newWnd;
	}

}
