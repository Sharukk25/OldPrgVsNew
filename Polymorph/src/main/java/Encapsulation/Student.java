package Encapsulation;

public class Student {

	private String name;
	private String emailid;
	private int accNo;
	
	public void setter(String name,String emailid,int accNo)
	{
		this.name=name;
		this.emailid=emailid;
		this.accNo=accNo;
	}
	
	public void getter()
	{
		
		System.out.println("Name is " +name);
		System.out.println("Email is " +emailid);
		System.out.println("Account no is " +accNo);
	}
	
}
