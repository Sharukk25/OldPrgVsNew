package Modifiers;

public class AccessDemo {

	  int age = 25;
	 public void display()
	{
		System.out.println("Age is" +age);
	}
	
	public static void main(String args[])
	{
		AccessDemo ad =  new AccessDemo();
		ad.display();
	}
}
