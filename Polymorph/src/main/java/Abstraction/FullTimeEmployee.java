package Abstraction;

public  class FullTimeEmployee extends Employee {

	String name = "Veena";
	public void calculateSalary()
	{
		System.out.println(" ");
		System.out.println("Full time employee Details ");
		float totalPayment=fullSalary*hour;
		System.out.println("Name =" +name);
		System.out.println("Total working hours :"+hour);
		System.out.println("Salary per hour = " +fullSalary);
		System.out.println("Total payment full time employee  :" +totalPayment);
		}
}
	
	
	