
public class Bootcamp {
	
	public static void welcome(double value) throws DigitException, AnotherDigitException {
		if(value>25){
			throw new DigitException();
		}else{
			throw new AnotherDigitException();
		}
	}
	
	public static int bye(){
		
		try{
			welcome(299.7);
		}catch (DigitException temp){
			return 605;
		}catch (AnotherDigitException temp2){
			return 230;
		}
		return 0;
	}
}
