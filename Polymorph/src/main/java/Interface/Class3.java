package Interface;

public class Class3 implements Multiple1,Multiple2 {

	
	public void Multiple1()
	{
		System.out.println("Interface1 implemetation");
		
	}
	
	
	public void print()
	{
		System.out.println("Name is " +NAME);
		System.out.println("Age is " +AGE);
		System.out.println("empId is " +EMPID);
	}
	
	public void show()
	{
		System.out.println("Interface2 implemetation");
		System.out.println("Salary is  " + SALARY);
	}
	
	public static void main(String[] args) {
		
		Class3 obj = new Class3();
		obj.Multiple1();
		obj.print();
		obj.show();

	}

}
