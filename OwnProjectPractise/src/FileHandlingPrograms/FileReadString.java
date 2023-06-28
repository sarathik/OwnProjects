package FileHandlingPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadString {
	
	public void readString() throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while((st=br.readLine())!= null)
		{
			System.out.println(st);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		FileReadString fs = new FileReadString();
		fs.readString();
	}

}
