
public abstract class Shape {
	
	private int sides;
	
	Shape(int sides){
		this.sides = sides;
	}
	
	public void setSides(int sides){
		this.sides = sides;
	}
	public int getSides(){
		return sides;
	}
	
	public abstract double area();
	public abstract double perimeter();
	public abstract void draw();
	
	public String toString(){
		return "This shape has " + sides + "sides";
	}
	
}
