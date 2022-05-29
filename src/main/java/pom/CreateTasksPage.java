package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTasksPage {
	@FindBy(xpath = "//span[.='Create Tasks']")
	private WebElement creteTaskBtn;
	
	public CreateTasksPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getCreteTask() {
		return creteTaskBtn;
	}

}
