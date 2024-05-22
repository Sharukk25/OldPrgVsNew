package InheritDemo;

public class Car extends Vechicle {

	String color = "black";
	
	public void print()
	{
		System.out.println(" Color=  " + color);
		System.out.println("Model is " +model);
	}

	public static void main(String[] args) 
	{
		
      Car c = new Car();
      c.display();
      c.print();
	}

}
