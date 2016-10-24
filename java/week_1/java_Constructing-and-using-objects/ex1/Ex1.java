import java.lang.*;

public class Ex1 {


	public static int Bootcamp(int i,int e) {
		if (i<e){
			return (int)(Math.sqrt(Math.abs(e-i)));
		}else {
			return (e+i);
		}

	}


	public static void main(String args[]) {
		 System.out.println(Bootcamp(91,25));
		 System.out.println(Bootcamp(25,91));

		}


}