package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTaskPage 
{
	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement SelectClick;
	
	@FindBy(xpath = "//select[@name='projectId']")
	private WebElement SelectPrj;
	
	@FindBy(xpath = "//input[@id='task[0].name']")
	private WebElement TxtFld;
	
	@FindBy(xpath = "//input[@name='projectName']")
	private WebElement PrtName;
	
	@FindBy(xpath = "//img[@id='ext-gen7']")
	private WebElement Date;
	
	@FindBy(xpath = "//a[.='21']")
	private WebElement DateSlct;
	
	@FindBy(xpath = "//input[@id='task[0].markedToBeAddedToUserTasks']")
	private WebElement Mark;
	
	@FindBy(xpath = "//input[@value='Create Tasks']")
	private WebElement CretTheTask;


	public CreateNewTaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSelectClick() {
		return SelectClick;
	}


	public WebElement getSelectPrj() {
		return SelectPrj;
	}


	public WebElement getTxtFld() {
		return TxtFld;
	}


	public WebElement getPrtName() {
		return PrtName;
	}


	public WebElement getMark() {
		return Mark;
	}


	public WebElement getDate() {
		return Date;
	}


	public WebElement getDateSlct() {
		return DateSlct;
	}


	public WebElement getCretTheTask() {
		return CretTheTask;
	}


}
