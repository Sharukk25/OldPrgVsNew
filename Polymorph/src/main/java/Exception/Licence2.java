package Exception;

public class Licence2 {

	
		
		public static void display(int age) throws LicenceException
		{
			if(age<18)
			{
				throw new LicenceException("Not eligible for license");
			}
			else
			{
				System.out.println("Eligible");
			}
		}
		
		public static void main(String[] args)
		{
			try
			{
				Licence2.display(15);
			}
			catch(LicenceException le)
			{
				System.out.println(le);
			}
			}
			
		}




