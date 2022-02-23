package filehandling;

import java.io.FileWriter;
import java.io.IOException;
public class writedata {
	public static void main(String[] args) {
		String data = "sandeep,,Mphasis,pune,india";
		try {
			FileWriter output = new FileWriter("sandeep.txt");
			output.write(data);
			System.out.println("data written successfully");
			output.close();
		}catch
		(IOException ex) {
		System.out.println("file Write error");
		}
	}

}

