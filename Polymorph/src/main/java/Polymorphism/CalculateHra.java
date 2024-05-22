package Polymorphism;

public class CalculateHra extends Employee{

	public CalculateHra(float basicpay, float deduction, float bonus) {
		super(basicpay, deduction, bonus);
		
	}

	public double CalcHra() 
	{
		double hra = 0.05* basicpay;
		return hra;
		
		
	}
	
	public double CalcPf()
	{
		double pf = 0.20*basicpay;
		return pf;
	}

}
