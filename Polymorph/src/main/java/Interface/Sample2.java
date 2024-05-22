package Interface;

public class Sample2 implements Sample1 {

	public void show()
	{ 
		System.out.println("Max value is " + MAX_VALUE);
		System.out.println("Min value is " + MIN_VALUE);
	}
	public void print()
	{
		System.out.println("Print method impementation");
	}
	public static void main(String args[])
	{
		Sample1 obj = new Sample2();
		obj.show();
		obj.print();
	}
	
}
