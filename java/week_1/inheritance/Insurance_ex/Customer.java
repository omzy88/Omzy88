
public class Customer 
{
	
	private int customer_code;
	private static int counter;
	private String name;
	private int birth_year;
	private String sex;
	
	//constructor
	Customer(String name, int birth_year, String sex)
	{
		this.name = name;
		this.birth_year = birth_year;
		this.sex = sex;
		counter++;
		this.customer_code = counter;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBirthYear(int birth_year)
	{
		this.birth_year = birth_year;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public void setCustomerCode(int customer_code)
	{
		this.customer_code = customer_code;
	}
	
	//getters
	public String getName()
	{
		return this.name;
	}
	public int getBirthYear()
	{
		return this.birth_year;
	}
	public String getSex()
	{
		return this.sex;
	}
	public int getCustomerCode()
	{
		return this.customer_code;
	}
	
	@Override
	public String toString()
	{
		return "customer code = " + this.customer_code +
				"\nname = " + this.name +
				"\nbirth year = " + this.birth_year +
				"\nsex = " + this.sex; 
	}
	
}
