package Collection;

import java.util.ArrayList;
import java.util.List;

public class IntListDemo {

	public static void main(String[] args) {
		List <Integer> obj = new ArrayList(); //wrapper class
		System.out.println("Integer list");
		obj.add(25);
		obj.add(27);
		obj.add(5);
		System.out.println(obj);
		System.out.println("");
		
		System.out.println("Floating list");
		ArrayList <Float> obj1 = new ArrayList<Float>();
		obj1.add(20.5F);
		obj1.add(30.5F);
		obj1.add(10.5F);
		System.out.println(obj1);
		System.out.println("");
		
		List <Character> obj2 = new ArrayList();
		System.out.println("Character list");
		obj2.add('a');
		obj2.add('e');
		obj2.add('i');
		System.out.println(obj2);
		System.out.println("");
	}

}
