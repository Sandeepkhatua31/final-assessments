package filehandling;
import java.io.FileReader;
import java.io.IOException;

public class readdatafromafile {
public static void main(String[] args) {
	char[]data =new char[100];
	try {
		FileReader input = new FileReader("sandeep.txt");
		input.read(data);
		System.out.println("data received from a file");
		System.out.println(data);
		input.close();
	}
	catch (IOException ex) {
		System.out.println("file read error...");
	}
}
}
