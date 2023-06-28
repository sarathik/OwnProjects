package FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadParticularCell {
	
	public void readExcelCell(int row, int col) throws BiffException, IOException {
		String filePath = "../OwnProjectPractise/Demoxls.xls";
		File f = new File(filePath);
		Workbook wk=Workbook.getWorkbook(f);
		Sheet s=wk.getSheet(0);
		String data;
		Cell c= s.getCell(col, row);
		data = c.getContents();
		System.out.println("Data : " + data);
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		ExcelReadParticularCell ex = new ExcelReadParticularCell();
		ex.readExcelCell(1, 2);

	}

}
