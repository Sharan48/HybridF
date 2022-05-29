package tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;

import genericUtility.Baseclass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import pom.CreateNewTaskPage;
import pom.CreateTasksPage;
import pom.Homepage;
import pom.Iframe;

public class CreateNewTaskTest extends Baseclass 
{
	@Test(groups= {"smokeTest"})
	public void createSimpleContact()
	{
		Homepage Hm=new Homepage(driver);
//		Hm.getTaskbtn().click();
//		Hm.getLeaveBtn().click();
//		Hm.getRaDio().click();
//		WebElement m = Hm.gettAble();
//		wLib.dropDown(m, "3");
//		Hm.getlEaveT().sendKeys("5");
//		Hm.getoK().click();
		
		//scroll and Iframe3
		Iframe IF=new Iframe(driver);
		WebElement Wnd = IF.getNewWnd();
		wLib.scrollWebele(driver, Wnd);
		Wnd.click();
		WebElement ifr = IF.getiFreame();
		wLib.switchframe(driver, ifr);
		
//		Hm.getNewWnd().click();
//		String id = driver.getWindowHandle();
//		System.out.println(id);
		
		
	/*	CreateTasksPage CTP=new CreateTasksPage(driver);
		CTP.getCreteTask().click();
		
		CreateNewTaskPage CNTP=new CreateNewTaskPage(driver);
		WebElement g = CNTP.getSelectClick();
		wLib.dropDown(g, "1");
		
		 WebElement k = CNTP.getSelectPrj();
		 wLib.dropDown(k, "-5");
		 
//		 Select Ks=new Select(k);
//		 Ks.selectByValue("-5");
		 
		 
		 CNTP.getTxtFld().sendKeys("Sharan"+jLib.getRanDomNumber());
		 CNTP.getPrtName().sendKeys("SAMPLEDEMO"+jLib.getRanDomNumber());
		 CNTP.getDate().click();
		 CNTP.getDateSlct().click();
		 CNTP.getMark().click();
		 CNTP.getCretTheTask().click();*/
		 
	}
}
	
/*	@Test(groups= {"regressionTest"})
	public void jj()
	{
		System.out.println("regressionTest");
	}
	
	
	
}*/
