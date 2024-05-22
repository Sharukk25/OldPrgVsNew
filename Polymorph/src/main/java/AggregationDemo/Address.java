package AggregationDemo;

public class Address {
	
	int hnum,pin;
	String street,name;
	
	public Address(int hnum,int pin,String street,String name)
	{
		this.hnum=hnum;
		this.pin=pin;
		this.street=street;
		this.name=name;
		System.out.println("Address constructor");
	}
	

}
