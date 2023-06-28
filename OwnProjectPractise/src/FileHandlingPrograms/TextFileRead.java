package FileHandlingPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public void fileRead() throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f=new File(filePath);
		FileReader fr = new FileReader(f);	
		int a;
		while((a=fr.read())!= -1) {
			System.out.println((char)a);
		}
	}
	
	public static void main(String[] args) throws IOException {
		TextFileRead tf = new TextFileRead();
		tf.fileRead();
	}
}
