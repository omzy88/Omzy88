
public class Ex1 {

	public static void main(String[] args) {
		
		int[] array = {1, 3, 1, 2, 5, 6, 1, 6, 8, 9, 12, 1, 13, 3, 1};
		int min = array[0];
		String s = "0, ";
		for(int i = 1; i<array.length; i++){
			if (array[i]<min){
				min = array[i];
				s = i +", ";
			}else if(array[i] == min){
				s += i + ", ";
				
			}
			
		}
		System.out.println(s);
	}

}
