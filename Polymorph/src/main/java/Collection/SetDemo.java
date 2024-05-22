package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		System.out.println("Non-generic ");
		HashSet set1 = new HashSet();
		set1.add("Mercury");
		set1.add(1);
		System.out.println(set1);
		System.out.println();
		
		System.out.println("Generic ");
		HashSet <Character> set2 = new HashSet <Character>();
		set2.add('A');
		set2.add('A');
		set2.add('E');
		System.out.println(set2);
		System.out.println();
		System.out.println("Iterator ");
		Iterator <Character>i = set2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		 
		System.out.println();
		System.out.println("Removing ");
		set2.remove('A');
		System.out.println(set2);
		System.out.println(" Based on index= Removing ");
		set1.remove(1);
		System.out.println(set1);
		
		System.out.println();
		System.out.println("Adding all ");
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println();
		
		System.out.println("Removing all ");
		set1.removeAll(set2);
		System.out.println(set1);
		System.out.println();
		
		System.out.println("Size method ");
		System.out.println(set1.size());
		System.out.println(set1);
		System.out.println();
		
		System.out.println("Contains method ");
		System.out.println(set1.contains("Mercury")); //returns true if element exist
		System.out.println(set1);
		
		System.out.println();
		//System.out.println("Set method "); // set and get wont work in hastag
		//System.out.println(get(set1));
		//Collections.sort(set1); //wont wrk
		
		
	}

	private static char[] get(HashSet set1) {
		// TODO Auto-generated method stub
		return null;
	}

}
