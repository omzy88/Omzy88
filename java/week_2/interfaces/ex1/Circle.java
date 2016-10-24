package interfaces;

public class Circle implements Shape {

	protected double radius;

	@Override
	public double getParameter() {
		return 15.0;
		
	}

	@Override
	public double getArea() {
		return 10.0;
		
	}
	
}
