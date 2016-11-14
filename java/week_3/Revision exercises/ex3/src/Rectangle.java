
public class Rectangle extends Shape{

	
	private int a;
	private int b;
	
	Rectangle(int a, int b){
		super(4);
		this.a = a;
		this.b = b;
		
	}
	
		
	//getters, setters
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
	
	@Override
	public String toString(){
		return "a = " + a +	"\nb = " + b;
	}
	
	public boolean areEqual(int a, int b){
		if(a == this.a && b == this.b){
			return true;
		}else{
			return false;
		}
	}
	
	public void isSquare(){
		if(this.a == this.b){
			System.out.println("it is a square");
		}else{
			System.out.println("it is not a square");
		}
	}
	
	public void draw(){
		for(int i = 0;i<this.a+2;i++){
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 0;i<this.b-2;i++){
			System.out.print("*");
			for(int y = 0;y<this.a;y++){
				System.out.print("  ");
			}
			System.out.print(" *");
			System.out.println();
		}
		for(int i = 0;i<this.a+2;i++){
			System.out.print("* ");
		}
		System.out.println();
	}
	

	@Override
	public double area() {
		return a * b;
	}

	@Override
	public double perimeter() {
		return (2*a +2*b);
	}
	
	
	
}

