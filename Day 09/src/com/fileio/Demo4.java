package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("first.txt",true); // true is written to allow appending to the file
			fw.write("\nI am adding the text into file");
			System.out.println("File is modified ");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}