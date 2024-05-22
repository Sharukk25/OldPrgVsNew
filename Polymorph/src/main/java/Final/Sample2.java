package Final;

public class Sample2 extends Sample1 {

	
	
	public void print()
	{
		System.out.println("Child class");
	}
	
	
	public static void main(String args[])
    {
		Sample2 obj = new Sample2();
    	obj.print();
    }
}
