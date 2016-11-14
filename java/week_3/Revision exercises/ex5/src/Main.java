
public class Main {

	public static void main(String[] args) {
		
		TimeComparator comp = new TimeComparator();
		TimeCom time1 = new TimeCom(21,43,12);
		TimeCom time2 = new TimeCom(4,56,8);
		
		System.out.println(comp.compare(time1, time2));

	}

}
