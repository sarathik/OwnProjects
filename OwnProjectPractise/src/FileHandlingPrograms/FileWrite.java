package FileHandlingPrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public void fileWr() throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("This the writing in the exiting file");
		bw.newLine();
		bw.write("Write in next line");
		bw.newLine();
		bw.write("Writing in next lne aagain");
		bw.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		FileWrite fww = new FileWrite();
		fww.fileWr();
	}
	

}
