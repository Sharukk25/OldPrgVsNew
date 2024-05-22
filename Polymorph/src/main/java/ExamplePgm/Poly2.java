package ExamplePgm;

public class Poly2 extends Poly1 {
	
	public void display(int a ,int b)
	{
		super.display(4,5);
		int sum = a+b;
		System.out.println("Child sum is " +sum);
		
	}

	public static void main(String[] args) {
	
		Poly1 obj = new Poly2();
		obj.display(5,5);
	}

}
