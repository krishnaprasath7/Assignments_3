import java.util.Scanner;

public class ExcepHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     
        
        int a[];
        a=new int[1];
        
		double result;
		
		try{
			if(n==1)              
			{
				int n1=sc.nextInt();
		        int n2=sc.nextInt();
			    result=n1/n2;                        //Arithmetic exception
			    System.out.println(result);
			
			}
			else
			{
				System.out.println(a[5]);           //ArrayIndexOutOfBounds exception
			}
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			
			System.out.println("Program executed successfully");
		}

	}


}
