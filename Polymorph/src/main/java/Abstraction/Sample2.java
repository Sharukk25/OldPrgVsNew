package Abstraction;

public class Sample2 extends Sample1 {

	public void display()
	{
		System.out.println("Implementation of Abstract method");
	}
	public static void main(String[] args) {
		Sample2 obj = new Sample2();
		obj.display();
		obj.print();

	}

}
