import java.io.IOException;
import java.util.Scanner;

public class ThrowIO {
	double display(int l,int b) throws IOException{
		double area;
		if(l>b)
		{
			throw new IOException("Length is greater than breadth");
		}
		else
		{
			area=l*b;
		}
		return area;
	}

	public static void main(String[] args) {
		
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length");
		l=sc.nextInt();
		System.out.print("Enter the breadth");
		b=sc.nextInt();
		
		ThrowIO t=new ThrowIO();
		
		try{
			System.out.println(t.display(l, b));
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
		finally
		{
			System.out.println("Program executed successfully");
		}

	}

}
