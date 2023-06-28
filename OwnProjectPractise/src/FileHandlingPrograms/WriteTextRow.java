package FileHandlingPrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTextRow {
	
	public void wrtTextRow(int row) throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		String stText;
		System.out.println("Please enter the data: ");
		for (int i=0;i<row;i++)
		{
			stText = sc.nextLine();
			br.write(stText);
			br.newLine();
		}
		br.close();
		 
		
		
	}

	public static void main(String[] args) throws IOException {
		WriteTextRow wr= new WriteTextRow();
		wr.wrtTextRow(4);
		// TODO Auto-generated method stub

	}

}
