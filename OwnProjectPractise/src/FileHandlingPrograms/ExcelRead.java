package FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
	
	public void readDataExcel() throws BiffException, IOException {
		
		String filePath = "../OwnProjectPractise/Demoxls.xls";
		File f = new File(filePath);
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		int row=sh.getRows();
		System.out.println(row);
		int col=sh.getColumns();
		System.out.println(col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell cl =sh.getCell(j, i);
				System.out.println(cl.getContents());
			}
		}
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		
		ExcelRead er = new ExcelRead();
		er.readDataExcel();
	}
	

}
