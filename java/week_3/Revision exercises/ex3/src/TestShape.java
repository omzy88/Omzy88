
public class TestShape {

	public static void main(String[] args) {
		
		Shape rec1 = new Rectangle(2,3);
		Rectangle rec2 = new Rectangle(3,5);
		Rectangle rec3 = new Rectangle(7,7);
		Rectangle rec4 = new Rectangle(3,3);
		
		((Rectangle)rec1).isSquare();
		System.out.println(((Rectangle)rec1).areEqual(3, 5));
		
		Shape[] array_of_shapes = new Shape[3];
		
		array_of_shapes[0] = rec1;
		array_of_shapes[1] = rec2;
		array_of_shapes[2] = rec3;
		
		for(int i =0; i<array_of_shapes.length;i++){
			System.out.println(array_of_shapes[i].toString());
		}
		
		
		
		
	}

}
