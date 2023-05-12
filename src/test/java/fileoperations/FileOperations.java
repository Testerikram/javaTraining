package fileoperations;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
	
		
		File n = new File("D:\\ikram");
		File n1 = new File("D:\\ikram\\ikram.txt");
		File n2 = new File("D:\\ikram\\ikram.txt");
		
		
		
		if (n.exists())
		{
			System.out.println("File has alraedy created");
		}
		else
		{
			n.mkdir();
			try {
				n1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			n2.toPath();
			
		}
		
		

	}

}
