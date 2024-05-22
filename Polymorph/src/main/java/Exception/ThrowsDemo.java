package Exception;

public class ThrowsDemo {

	public static void display(int a,int b) throws ArithmeticException
	{
		
		int sum = a+b;
		System.out.println(sum);
		if(sum>50)
		{
			throw new ArithmeticException("Sum is greater than 50");
		}
		else
		{
		System.out.println("Sum is less than 50");	
		}
	}
	public static void main(String[] args) {
		ThrowsDemo.display(5,70);

	}

}
