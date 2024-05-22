package Encapsulation;

public class Emp1 {

	public static void main(String[] args) {
		Employee obj= new Employee();
		obj.seteName("Sharu");
		obj.setEmpId(12345);
		obj.setSalary(50000);
		
		 System.out.println("Name is :" + obj.geteName());
	     System.out.println("Emp id is " + obj.getEmpId());
	     System.out.println("Salary is " +obj.getSalary());
	     
	}

}
