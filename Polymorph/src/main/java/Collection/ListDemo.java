package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String arg[])
	{

	List <String> obj = new ArrayList();
	obj.add("Apple");
	obj.add("Orange");
	obj.add("Watermelon");
	System.out.println(obj);
	System.out.println();
	
	System.out.println("Non-generic collection");
	ArrayList obj1 = new ArrayList();
	obj1.add(1);
	obj1.add('x');
	obj1.add("Abhi");
	System.out.println("Iterator");
	Iterator i = obj1.iterator();  //iterator
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("Iterator remove");
	i.remove(); //to remove last element
	System.out.println(obj1);
	System.out.println(obj1.size()); //size
	System.out.println(obj1.isEmpty());
	obj1.remove(2);  //remove based on index
	System.out.println(obj1);
	System.out.println(obj1.contains("Abhi")); //contains
	System.out.println();
					
	System.out.println("generic collection");
	ArrayList<String> obj3 = new ArrayList<String>(); 
	obj3.add("Veena");
	obj3.add("Rohan");
	System.out.println(obj3);
	obj3.remove("Veena");  //remove
	System.out.println(obj3);
	
	
	}
}
