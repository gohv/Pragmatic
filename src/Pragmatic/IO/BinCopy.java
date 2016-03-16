package Pragmatic.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;

public class BinCopy {

	public static void main(String[] args) {

		new File("res/test.txt");
		 		
				
		// relative path
		try {
			FileInputStream input = new FileInputStream("res/t.txt");
			FileOutputStream output = new FileOutputStream("res/new.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("No file!");
		}
		System.out.println("DONE");
	}

}
