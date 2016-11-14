package revision_ex2;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2,2);
		Rectangle r3 = new Rectangle(6,3);
		Rectangle r4 = new Rectangle(5,5);
		
		r3.draw();
		r2.areEqual(2, 2);
		r4.isSquare();
		r1.draw();
		r4.draw();

	}

}
