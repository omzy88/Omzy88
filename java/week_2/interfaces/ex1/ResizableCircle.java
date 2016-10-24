package interfaces;

public class ResizableCircle extends Circle implements Resizable{

	@Override
	public double resize() {
		
		return radius * 0.5;
	}

}
