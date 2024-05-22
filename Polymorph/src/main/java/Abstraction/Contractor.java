package Abstraction;

public class Contractor extends Employee {

	float totalPayment;
	public void calculateSalary()
	{
	System.out.println("Contractor Details ");
	totalPayment=Salaryper*hour;
	System.out.println("Name =" +empName);
	System.out.println("Total working hours :"+hour);
	System.out.println("Salary per hour = " +Salaryper);
	System.out.println("Total payment Contractor :" +totalPayment);
	}
	
	
	public static void main(String[] args) {
		Contractor obj = new Contractor();
		obj.calculateSalary();
		FullTimeEmployee obj1 = new FullTimeEmployee();
		obj1.calculateSalary();

	}

}
