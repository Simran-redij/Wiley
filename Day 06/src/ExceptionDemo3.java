import java.io.*;

// Try with resource or Automatic resource management with try : update in jdk 1.7

public class ExceptionDemo3 {

	public void processFile() {
		File f = new File("first.txt");
		try(FileInputStream fis = new FileInputStream(f);){ // now we can close all resources in try block itself, we need not have to close it separately
			
		}
		catch(IOException io) {
			
		}
	}
}
