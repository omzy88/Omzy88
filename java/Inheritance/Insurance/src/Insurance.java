
public class Insurance
{
	protected int customer_code;
	protected int insurance_code; 
	protected static int counter_insur;
	protected int duration;
	
	Insurance(int customer_code, int duration)
	{
		this.customer_code = customer_code;
		counter_insur++;
		this.insurance_code = counter_insur;
		this.duration = duration;
		
	}
	
	//setters
	public void setCustomerCode(int customer_code)
	{
		this.customer_code = customer_code;
	}
	public void setInsuranceCode(int insurance_code)
	{
		this.insurance_code = insurance_code;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
		
	//getters
	public int getCustomerCode(int customer_code)
	{
		return this.customer_code;
	}
	public int getInsuranceCode(int insurance_code)
	{
		return this.insurance_code;
	}
	public int getDuration(int duration)
	{
		return this.duration;
	}
	
	@Override
	public String toString()
	{
		return "customer code = " + this.customer_code +
				"\nInsurance code = " + this.insurance_code +
				"\nduration = " + this.duration;					
	}
	
	public int CalculateCost()
	{
		return 100;
	}
	
	public static void printInsurance()
	{
		for(int i = 0; i<TestInsurance.insurance_array.length;i++)
		{
			if(TestInsurance.insurance_array[i] != null)
			{
				System.out.println(TestInsurance.insurance_array[i].toString());
			}
			
		}
	}
	
	public static void printParticularInsur(int insurance_code)
	{
		for(int i = 0; i<TestInsurance.insurance_array.length;i++)
		{
			if(TestInsurance.insurance_array[i].insurance_code == insurance_code)
			{
				System.out.println(TestInsurance.insurance_array[i].toString());
			}
			
		}
	}
	
}
