
public class Life extends Insurance
{
	private int ammount;
	
	Life(int customer_code, int duration, int ammount)
	{
		super(customer_code, duration);
		this.ammount = ammount;
	}
	
	public void setAmmount(int ammount)
	{
		this.ammount = ammount;
	}
	public int getAmmount(int ammount)
	{
		return this.ammount;
	}
	@Override
	public String toString()
	{
		return super.toString() +
				"\nammount = "+ this.ammount;
	}
	
	
	
	@Override
	public int CalculateCost()
	{
		for(int i =0; i<TestInsurance.customer_array.length; i++)
		{	
			if(TestInsurance.customer_array[i].getCustomerCode() == this.customer_code)
			{
				return (((2016 - (TestInsurance.customer_array[i].getBirthYear())) * 5 ) + 100);
			}
		}
		return 0;
	}
}
	
