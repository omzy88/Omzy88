import java.util.InputMismatchException;
import java.util.Scanner;

public class Quotient {
	
	public static int calcQuotient(int numerator, int denominator) throws ArithmeticException{
		if (denominator == 0){
			throw new ArithmeticException();
		}
		return numerator / denominator;
	}
	
	public static void main(String[] args){
			
		int numerator,denominator,result;
		boolean success = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter nominator, press enter and then enten denominator: ");
		
		while(!success){
			try{
				numerator = input.nextInt();
				denominator = input.nextInt();
				result = calcQuotient(numerator, denominator);
				success = true;
			}catch (InputMismatchException ex){
				System.out.println("Wrong Input");
				input.nextLine();
			}catch (ArithmeticException ex){
				System.out.println("Denominator is 0");
			}
		}
		
		
	}
}
