package InheritDemo;

public class Daughter extends Father{

	int age =18;
	public void child()
	{
		System.out.println("daughters age is " +age);
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		 Son s = new Son();
		 d.display();
		 s.print();
          
          //Grandfather gf = new Grandfather();
          
         
           s.details();
         
          d.child();
	}

}
