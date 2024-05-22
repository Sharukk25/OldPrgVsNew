package Interface;

public class HDFC implements RBI {

	public void recurringdeposit()
	{
		
		System.out.println("Recurring deposit");
		System.out.println("Amount to be deposited per month " +AMOUNT);
		System.out.println("Duration of deposit : "+MONTH  +" months");
		System.out.println("Interest rate :" +INTEREST);
	}
	
	public  void Interest()
	{
	double totalAmt = AMOUNT*MONTH;
	double interestAmt = AMOUNT*INTEREST*MONTH;
	System.out.println("Total Amount after 60 months : " +totalAmt);
	System.out.println("Interset earned for  60 months : " + interestAmt);
	}
	
	public static void main(String args[])
	{
		HDFC obj = new HDFC();
		obj.recurringdeposit();
		obj.Interest();
	}
}
