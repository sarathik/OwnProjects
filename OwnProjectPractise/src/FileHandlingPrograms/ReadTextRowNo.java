package FileHandlingPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextRowNo {
	
	public void readDataParticularRow(int rowNo) throws IOException {
		String filePath = "../OwnProjectPractise/Demo.txt";
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String st;
		int row=0;
		while((st=br.readLine())!=null)
		{
			row=row+1;
			if(row==rowNo)
			{
				System.out.println(st);
				break;
			}
			
		}	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ReadTextRowNo read= new ReadTextRowNo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row no: ");
		int a=s.nextInt();
		read.readDataParticularRow(a);
	}

}
