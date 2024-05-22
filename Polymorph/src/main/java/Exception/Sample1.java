package Exception;

public class Sample1 {

	public static void main(String[] args) {
		int a =5;
		int b=10;
		int sum =a+b;
		
		try
		{
			int result = 50/0;
			
			System.out.println("test");
			 // to run this exception place this code at first
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Catching arithmetic exception");
		}
		
		finally
		{
			System.out.println("in the final block");
		}
	
		System.out.println("Sum is " +sum);    
	}

}

