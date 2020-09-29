package apache_POI_Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//to create workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		//to create sheet
		XSSFSheet sheetname=workbook.createSheet("Sheet");
		//to create row
		Row row0=sheetname.createRow(0);
		//to create cell or column
		Cell CellA=row0.createCell(0);
		Cell CellB=row0.createCell(1);
		//to set values for cell or column
		CellA.setCellValue("username");
		CellB.setCellValue("password");
		
		//to get file location & set excel name
		File Filelocation=new File("C:\\vinoth\\Selenium\\apache_POI\\Handson\\TestData.xlsx");
		
		FileOutputStream TestData=new FileOutputStream(Filelocation);
		//to write set values into file
		workbook.write(TestData);
		
		//to close the created excel file
		workbook.close();
		
	
		
		
		
		
		
		
	}

}
