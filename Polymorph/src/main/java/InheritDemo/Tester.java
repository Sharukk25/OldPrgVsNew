package InheritDemo;

public class Tester  extends Employee {

	String company = "Wipro";
	public void test()
	{
		System.out.println("Company name is " +company);
	}
	public static void main(String[] args) {
		
		Tester t = new Tester();
		t.display();
		Developer d = new Developer();
		d.print();
		t.test();	
		
	}

}
