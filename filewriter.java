import java.io.FileWriter;

public class filewriter {
	public static void main(String args[]) {
		String name1= "Hello world!";
		try{
			FileWriter output = new FileWriter("C:\\Users\\krish\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\Filehandling\\");
		
		    output.write(name1);
		    
		     System.out.println("Data is written to the file.");

	     
	      output.close();
		
		}	
		catch (Exception e) {
		      e.getStackTrace();
		    }
	}

}
