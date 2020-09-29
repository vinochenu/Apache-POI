package apache_POI_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public Object [][] readExcel() throws IOException{
		
		File file=new File("C:\\vinoth\\Selenium\\Test Data_Excel\\Data_credential.xlsx");
		
		FileInputStream Fis=new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("row count is "+rowcount);
		

		
		Object [][]credential=new String[rowcount][10];
		System.out.println(credential[0][0]);
		System.out.println(credential[0][1]);
		
		for(int i=0;i<rowcount;i++) {
			credential[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			credential[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(credential[i][0]);
			System.out.println(credential[i][1]);
		
		}
		return credential;
	}
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			Read_Excel Object=new Read_Excel();
			Object.readExcel();
	}

}
