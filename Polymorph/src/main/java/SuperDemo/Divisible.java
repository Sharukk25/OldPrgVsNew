package SuperDemo;


public class Divisible extends Addition {
	
	int result;
	
	public Divisible()
	{
		super();
		System.out.println("Divisible constructor");
	}
	
	public void display()
	{
		result = super.display(5, 5);
	    System.out.println("Sum of " +super.num1 + " and " + super.num2 + " = " +result);
		
	}
	
	public void print()
	{
		if(result % 10 == 0)
		{
			System.out.println(result + " is divisible by 10");
		}
		else
		{
			System.out.println(result + " is not divisible by 10");
	    }
	}

	public static void main(String[] args) {
		
      Divisible d = new Divisible();
      d.display();
      d.print();
      
	}

}
