package FileHandlingPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextRange {
	
	public void readTxtRange(int start, int end) throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		for(int i=start;i<=end;i++)
		{
			st=br.readLine();
			System.out.println(st);
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		ReadTextRange r=new ReadTextRange();
		r.readTxtRange(3, 5);
	}

}
