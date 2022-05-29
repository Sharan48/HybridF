package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{

	public String getDataFromExcel(String Sheet, int rowNum, int celNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fls=new FileInputStream("./data/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		String data = wb.getSheet(Sheet).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;

	}
	public int getRow(String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
		Workbook ws = WorkbookFactory.create(fis);
		Sheet sh = ws.getSheet(sheetName);
		ws.close();
		return sh.getLastRowNum();
	}
	public void setData(String sheet, int rowNum, int cellNum, String Data) throws IOException
	{
		FileInputStream fk=new FileInputStream("./data/testScriptData.xlsx");
		Workbook wd = WorkbookFactory.create(fk);
		wd.getSheet(sheet).createRow(rowNum).createCell(cellNum).setCellValue(Data);
		FileOutputStream flp=new FileOutputStream("./data/testScriptData.xlsx");
		wd.write(flp);
		wd.close();
	}
}
