package genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRanDomNumber()
	{
		Random ranDom=new Random();
		int rNum = ranDom.nextInt(10000);
		return rNum;
	}
	public String getSystemDate()
	{
		Date dat=new Date();
		String sysDat = dat.toString();
		return sysDat;
	}
}
