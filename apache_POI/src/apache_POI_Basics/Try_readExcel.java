package apache_POI_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Try_readExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
File file=new File("C:\\vinoth\\Selenium\\Test Data_Excel\\Data_credential.xlsx");
		
		FileInputStream Fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("row count is "+rowcount);

	}

}
