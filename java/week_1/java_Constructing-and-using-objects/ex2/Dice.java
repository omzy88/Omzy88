public class Dice {

	public static void roll() {

		int a,b;
		int temp = 0;
		do{
			a = (int) (Math.ceil(Math.random() * 6));
			b = (int) (Math.ceil(Math.random() * 6));
			temp += 1;
		}while ((a!=1) && (b!=1));

		System.out.print("We have rolled "+temp+" times the dice");

	}
}
