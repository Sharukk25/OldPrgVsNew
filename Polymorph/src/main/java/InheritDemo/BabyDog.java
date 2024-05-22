package InheritDemo;

public class BabyDog extends Dog {

	int count = 2;
	public void test()
	{
		System.out.println("count is "+count);
		System.out.println("Color is "+ color);
		
	}
	public static void main(String[] args) 
	{
		BabyDog bd = new BabyDog();
		bd.display();
		bd.print();
		bd.test();
		
	}

}
