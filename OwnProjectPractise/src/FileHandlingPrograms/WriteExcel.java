package FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class WriteExcel {
	
	public void wrExcel() throws IOException, RowsExceededException, WriteException {
		String filePath = "../OwnProjectPractise/Demoxls_new1.xls";
		File f = new File(filePath);
		WritableWorkbook ws = Workbook.createWorkbook(f);
		WritableSheet sheet= ws.createSheet("Sample", 0);
		for (int i=0;i<1;i++)
		{
			
				Label l=new Label(0,i,"Paapa");
				sheet.addCell(l);
				Label l2=new Label(1,i,"6");
				sheet.addCell(l2);
			
		}
		ws.write();
		ws.close();
	}
		public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
			
		WriteExcel wrt = new WriteExcel();
		wrt.wrExcel();
		}
	

}
