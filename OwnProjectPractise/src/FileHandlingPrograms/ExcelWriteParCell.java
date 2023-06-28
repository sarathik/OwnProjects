package FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWriteParCell {

	public void writeinCell(int row, int col) throws IOException, RowsExceededException, WriteException {
		String filePath = "../OwnProjectPractise/Demoxls2.xls";
		File f = new File(filePath);
		WritableWorkbook wr = Workbook.createWorkbook(f);
		WritableSheet ws = wr.createSheet("Test1", 0);
		Label l = new Label(col,row,"PASS");
		ws.addCell(l);
		wr.write();
		wr.close();
	}
	
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		ExcelWriteParCell exr = new ExcelWriteParCell();
		exr.writeinCell(1, 4);
		// TODO Auto-generated method stub

	}

}
