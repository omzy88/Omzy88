
public class Health extends Insurance
{
	private int medical;
	
	Health(int customer_code, int duration, int medical)
	{
		super(customer_code, duration);
		this.medical = medical;
	}
	public void setMedical(int medical)
	{
		this.medical = medical;
	}
	public int getMedical(int medical)
	{
		return this.medical;
	}
	@Override
	public String toString()
	{
		return super.toString() +
				"\nmedical = "+ this.medical;
	}
	
	@Override
	public int CalculateCost()
	{
		for(int i =0; i<TestInsurance.customer_array.length; i++)
		{	
			if(TestInsurance.customer_array[i].getCustomerCode() == this.customer_code)
			{
				int temp = (((2016 - (TestInsurance.customer_array[i].getBirthYear())) * 7 ) + 100);
				if (TestInsurance.customer_array[i].getSex() == "male")
				{
					temp += 50;
					
				}
				return temp;
			}
		}
		return 0;
		
		
		
		
	}
	
	
}
