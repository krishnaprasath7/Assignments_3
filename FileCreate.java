import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("input");
		FileOutputStream fo=new FileOutputStream("output");
		if(fi!=null) {
			System.out.println("file exists");
		}
		int i=0;
		while((i=fi.read())!=-1)
		{
			fo.write(i);
			

		}
		fo.close();
		fi.close();
	}

}
