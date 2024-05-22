package Exception;

public class Sample2 {

	
	public static void display(int a,int b)
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
		
        	Sample2.display(45, 25);
	}

}
