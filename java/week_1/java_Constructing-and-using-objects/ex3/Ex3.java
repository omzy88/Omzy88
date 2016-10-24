import java.lang.*;

public class Ex3 {


	public static void main(String args[]) {
		int temp = 0;
		int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};

		for(int y = 0; y<10; y++){
			temp = array1[9];
			for(int i = 9; i>0; i--){
				array1[i] = array1[i-1];
			}
			array1[0] = temp;
			for(int x = 0; x<10; x++){
				System.out.print(array1[x]);
			}
			System.out.println();
		}

	}
}