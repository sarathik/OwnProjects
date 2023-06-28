package FileHandlingPrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextInRange {
	
	public void fileWriteRange(int start, int end) throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileWriter fr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("Please enter the line");
		for(int i=1; i<=end;i++)
		{
			if((i>=start)&&(i<=end))
			{
				data=sc.nextLine();
				br.write(data);
				br.newLine();
			}
			else
			{
				br.newLine();
			}
		}
		br.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteTextInRange wr=new WriteTextInRange();
		wr.fileWriteRange(2, 5);

	}

}
