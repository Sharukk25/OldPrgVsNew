package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo2 {

	public static void main(String args[])
	{
		ArrayList<String> obj = new ArrayList();
		obj.add("Abhi");
	    obj.add("Abhi");
	    obj.add("Sharu");
	   // obj.add(null);
	    System.out.println(obj);
	    System.out.println("Getmethod 1 "  +obj.get(2));  //get method
	    System.out.println(" ");
	    
	    System.out.println("For each loop" );
	    for(String s:obj)
	    {
	    	System.out.println(s);
	    }

	    System.out.println(" ");
	    System.out.println("Set method");  //replaced and added new name
	    obj.set(2, "Akash");
	    System.out.println(obj);
	    System.out.println("Get method2");
	    
	    System.out.println(" ");
	    System.out.println("Sort"); 
	    Collections.sort(obj);  //Sorting
	    System.out.println("After sorting");
	    System.out.println(obj);
	    
	    for(int i =0;i<obj.size();i++)
	    {
	    	System.out.println(obj.get(i));  
	    }
	    
	    System.out.println(" ");
	    
	    ArrayList<String> obj1 = new ArrayList();
	    obj1.add("Book");
	    obj1.add("Author");
	    obj1.add("Page");
	    obj1.add(2,"Abdul");
	    obj1.addAll(obj);  //adding first list elements
	    System.out.println(obj1);
	    obj.add("Book");
	    obj.removeAll(obj1);   //remove first list elements
	    System.out.println(obj);
	}
}
