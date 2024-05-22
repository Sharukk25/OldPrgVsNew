package Polymorphism;

public class TotalSalary extends CalculateHra {

	public TotalSalary(float basicpay, float deduction, float bonus) {
		super(basicpay, deduction, bonus);
		
	}
	public void display()
	{
      double hra =CalcHra();
      double pf = CalcPf();
	  double totalSalary = basicpay + hra-pf - deduction + bonus;
	  System.out.println("Salary Slip ");
	  System.out.println("Basic pay : " +this.basicpay);
	  System.out.println("Deduction  : " +this.deduction);
	  System.out.println("Bonus : " +this.bonus);
	  System.out.println("Hra : " + hra);
	  System.out.println("PF : " + pf); 
	  System.out.println("Total Salary "+totalSalary);
		
	}
	public static void main(String[] args) 
	{
		
		TotalSalary ts= new TotalSalary(50000,5000,2500);
		ts.display();
	} 
	
}
