
public class Poll {
	
	public static void main(String[] args) {
		
		int[] freqs = new int[10];
		int[] rate = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 8,
				4, 6, 8, 10};
		
		
		for(int y = 1; y<=10; y++){
			for(int i = 0; i<rate.length;i++){
				if(rate[i] == y){
					freqs[y-1]++;
				}
				
			}
		System.out.println(y + "   " + freqs[y-1]);
		}
		
		
	}
}
