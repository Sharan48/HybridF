package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement lgutbtn;


	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskMajorBtn;
	
	@FindBy(xpath = "//div[@id='leaveButton_0_mainContentTd']")
	private WebElement leaveBtn;
	
	@FindBy(xpath = "//input[@id='LeavePopupRadio_TimeOff']")
	private WebElement raDio;
	
	@FindBy(xpath = "//select[@name='LeaveTypeSelect']")
	private WebElement tAble;
	
	@FindBy(xpath = "//input[@name='LeaveTimeSpent']")
	private WebElement lEaveT;
	
	@FindBy(xpath = "//input[@name='LeavePopupOK']")
	private WebElement oK;
	

	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskbtn() {
		return taskMajorBtn;
	}

	public WebElement getLgutbtn() {
		return lgutbtn;
	}

	public WebElement getlEaveT() {
		return lEaveT;
	}

	public WebElement getLeaveBtn() {
		return leaveBtn;
	}

	public WebElement getRaDio() {
		return raDio;
	}

	public WebElement gettAble() {
		return tAble;
	}

	public WebElement getoK() {
		return oK;
	}


}
