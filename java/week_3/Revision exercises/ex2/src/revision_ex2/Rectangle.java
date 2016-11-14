package revision_ex2;

public class Rectangle {

	
	private int a;
	private int b;
	
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	Rectangle(){
		this.a = 1;
		this.b = 1;
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
	
	public Rectangle copy() {
		Rectangle new_rectangle = new Rectangle();
		new_rectangle.a = this.a;
		new_rectangle.b = this.b;
	    return new_rectangle;
	}
	
	
	
}

