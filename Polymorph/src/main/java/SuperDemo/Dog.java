package SuperDemo;

public class Dog extends Animal {

	String color = "White";
	String type = "cute";
	public void bark()
	{
		super.bark();
		System.out.println("Color is " + color);
		System.out.println("Type is "  + type);
		System.out.println("Type is "  + super.type);
	}
	
	public Dog()
	{
		System.out.println("Dog Constructor");
	}
	
	
	public static void main(String[] args) {
		
     Dog d = new Dog();
     d.display();
     d.bark();
     
	}

}
