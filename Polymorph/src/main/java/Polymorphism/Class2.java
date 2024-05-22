package Polymorphism;

public class Class2 extends Class1{

	public void display(int a,int b)
	{
		super.display(8,8);
		int sum = a+b;
		System.out.println("Child sum = " +sum);
	}
	public static void main(String[] args) {
		
		Class1 obj = new Class2();
		obj.display(5,5);
	}

}
