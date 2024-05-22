package SuperDemo;

public class Addition {
	
	int num1 , num2 , sum;
	
	public Addition()
    {
		System.out.println("Addition Constructor");

	}
	public int display(int num1,int num2)
	{
		this.num1 = num1;
		this.num2=num2;
		System.out.println("Adding two integers");
		sum = num1+num2;
		return sum;	
	}
}
