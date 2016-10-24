public class Circle {

	//fields
	private int x;
	private int y;
	private int r;
	public static int number_of_circles = 0;
	

	//setters and getters
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return this.x;
	}
	public void setY(int y){
			this.y = y;
	}
	public int getY(){
		return this.y;
	}
	public void setR(int r){
		this.r = r;
	}
	public int getR(){
		return this.r;
	}

	//default constructor
	Circle(){
		this.x = this.y = 0;
    	this.r = 1;
    	number_of_circles += 1;
	}
	//print method
    public void print(){
		System.out.println("I'm a circle at point ("+this.x+","+this.y+") with radius "+this.r);
	}

	//overloaded constructors
	Circle(int x, int y){
		this.x = x;
		this.y = y;
		this.r = 1;
		number_of_circles += 1;
	}
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		number_of_circles += 1;
	}

	static final double pi = 3.14;

	//calculateArea
	public double calculateArea(){
		return pi * r * r;
	}
	//calculatePerimeter
		public double calculatePerimeter(){
			return 2 * pi * r;
	}

	//copy constructor
	public Circle copy(){
		Circle new_circle = new Circle();
    	new_circle.x = this.x;
    	new_circle.y = this.y;
    	new_circle.r = this.r;
    	return new_circle;
	}

	//checks if 2 circles have the same center
	public boolean cocentric(Circle c){
		if (this.x == c.getX() && this.y == c.getY()){
			return true;
		}else{
			return false;
		}
	}
	
}