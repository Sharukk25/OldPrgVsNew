package AggregationDemo;

public class Student {
	String name;
	int age;
	Address ad; //aggregation
public Student(String name,int age,Address ad)
{
	this.name=name;
	this.age =age;
	this.ad =ad;
}

public void display()
{
	System.out.println("Name is " +this.name);
	System.out.println("Age is " +this.age);
	System.out.println("House number is" +ad.hnum);
	System.out.println("Pin is" +ad.pin);
	System.out.println("Street name is" +ad.street);
	
}

public static void main(String agrs[])
{
	Address add = new Address(206,68550,"Rajiv Nagar","AKG");
	Student std = new Student("Abhi",25,add); //class address object
	std.display();
	
	
}
}
