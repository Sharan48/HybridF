package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//rule2

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernametxtfld;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordtxtfld;
	
	@FindBy(xpath = "//a[.='Login ']")
	private WebElement loginbtn;
	
//rule3
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	//rule4
	public WebElement getUsernametxtfld() {
		return usernametxtfld;
	}

	public WebElement getPasswordtxtfld() {
		return passwordtxtfld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//reule5 business lib
	public void loginToApp(String username, String password)
	{
		getUsernametxtfld().sendKeys(username);
		getPasswordtxtfld().sendKeys(password);
		getLoginbtn().click();
	}
	
	
}

