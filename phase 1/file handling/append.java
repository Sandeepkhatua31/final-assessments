package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class append {
	public static void main (String[]args) {
		String data ="this data is appended..";
		try{
		FileWriter output =new FileWriter("sandeep.txt",true);
		output.write(data);
		System.out.println("Data appended successfully.");
		output.close();
		}catch(IOException ex)
		{
		System.out.println("file append error..");
		}
		}
		}

