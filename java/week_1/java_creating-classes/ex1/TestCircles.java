public class TestCircles {

	public static void main(String args[]) {
		Circle c0 = new Circle();

		c0.setX(2);
		c0.setY(3);
		c0.setR(1);

		c0.print();

		Circle c1 = new Circle(4,4);
		c1.print();

		Circle c2 = new Circle(5,3,2);
		c2.print();
		Circle c3 = c2.copy();

		c2.print();
		c3.print();

		c2.setX(6);
		c2.setY(7);
		c2.setR(4);

		c2.print();
		c3.print();



	}
}