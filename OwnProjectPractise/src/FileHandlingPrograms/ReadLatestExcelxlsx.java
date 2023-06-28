package FileHandlingPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLatestExcelxlsx {
	
	public void readxlsxData() throws IOException {
		String filePath = "../OwnProjectPractise/Demoxlsx.xlsx";
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet xs = wb.getSheetAt(0);
		
		int rows = xs.getPhysicalNumberOfRows();
		for(int i=0; i <rows ; i++)
		{
			XSSFRow xrow = xs.getRow(i);
			int cols = xrow.getPhysicalNumberOfCells();
			for(int j=0; j < cols; j++)
			{
				XSSFCell cl = xrow.getCell(j);
				System.out.println(cl.getStringCellValue()); // Need to understand how to get the both data in single program
			}
		}
				
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadLatestExcelxlsx rxlxs = new ReadLatestExcelxlsx();
		rxlxs.readxlsxData();

	}

}
