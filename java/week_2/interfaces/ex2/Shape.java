
public class Shape implements Agreeable {
	int width;
	int height;
	
	Shape(){
		this.width = 1;
		this.height = 2;
	}
	
	Shape(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int calcArea(int width, int height){
		return width * height;
	}
	
	@Override
	public boolean isSmallerThan(Agreeable shape) {
		if (this.calcArea(this.width,this.height) <((Shape) shape).calcArea(width,height)){
			return true;
		}else{
			return false;
		}
	}

}
