package tasks;

import org.testng.annotations.Test;

import genericUtility.Baseclass;

public class CreateTest12 extends Baseclass
{
@Test(groups= {"smokeTest"}) 
public void he()
{
	System.out.println("smoke");
}
@Test(groups= {"regressionTest"}) 
public void he1()
{
	System.out.println("regresstion");

}
}