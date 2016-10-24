
public class TestMain {

	public static void main(String[] args) {
		
		Shape square = new Shape();
		Shape square2 = new Shape(5,2);
		
		
		if (square.isSmallerThan(square2)) {
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
	}

}
