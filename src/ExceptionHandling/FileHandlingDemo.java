package ExceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException 
	{
		// To create a new file
		File f1 = new File(System.getProperty("user.dir")+"\\MyFile.txt");
		//f1.createNewFile();
		
		System.out.println("New File is created!");
		
		System.out.println("**********************");
		
		//to write data in file
		
		FileWriter wr = new FileWriter("MyFile.txt");
		
		wr.write("Hello All! Welcome to Java Last Topic");
		wr.write("\nLets start Selenium training");
		wr.close();
		System.out.println("File Writing is Completed");
	
		
		
		//to read a file
		
		Scanner sc =new Scanner(f1);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
		//To delete a file
		
		//f1.delete();
		System.out.println("File is deleted!");

	}

}
