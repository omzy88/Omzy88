
public class TestInsurance 
{

	public static Customer[] customer_array = new Customer[10];
	public static Insurance[] insurance_array = new Insurance[10];
	
	public static void main(String [] args)
	{
		
		Customer petros = new Customer("petros",1996,"male");
		Customer maria = new Customer("maria",1975,"female");
		Customer eleni = new Customer("eleni",1988,"female");
		Customer vasilis = new Customer("vasilis",1987,"male");
		Customer vasilis2 = new Customer("vasilis",1987,"female");
		
		customer_array[0] = petros;
		customer_array[1] = maria;
		customer_array[2] = eleni;
		customer_array[3] = vasilis;
		customer_array[4] = vasilis2;
		
		Life yearsOld20 = new Life(1,3,1000);
		Health yearsOld30 = new Health(4,4,2000);
		Health yearsOld40 = new Health(5,4,1000);
		
		System.out.println(yearsOld30.CalculateCost());
		System.out.println(yearsOld40.CalculateCost());
		
		insurance_array[0] = yearsOld20;
		insurance_array[1] = yearsOld30;
		
		Insurance.printInsurance();
	}
	
}
