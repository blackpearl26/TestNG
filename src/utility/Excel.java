package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException	{
	FileInputStream file = new FileInputStream("D:\\automation notes\\test data.xlsx");
	String data = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		String s = Excel.getData("Zerodha", 1, 0);
		System.out.println(s);
		Thread.sleep(0);
		String s1 = Excel.getData("Zerodha", 1, 1);
		System.out.println(s1);
		
	}

}
