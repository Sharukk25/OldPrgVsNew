package ExamplePgm;

public class Student2 extends Student1{

	
public void display()
{
	System.out.println("Implementation of abstract class");
}

public static void main(String agrs[])
{
	Student2 obj = new Student2();
	obj.display();
	obj.print();
}

}
