import java.lang.*;

public class Ex4 {


	public static void main(String args[]) {
		Double temp = 0.0;
		Double[] array1 = new Double[]{1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};

		for(int y = 0; y<10; y++){
			temp = array1[9];
			for(int i = 9; i>0; i--){
				array1[i] = array1[i-1];
			}
			array1[0] = temp;
			for(int x = 0; x<10; x++){
				System.out.print(array1[x]+" ");
			}
			System.out.println();
		}

	}
}