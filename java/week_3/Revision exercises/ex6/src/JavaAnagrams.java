import java.util.Arrays;

public class JavaAnagrams {

	
	public static void main(String[] args) {

		//This part of code will test your execution (Don't touch this part of code)
		//Test Case 1
		System.out.println("Input Testing: anargram and margana");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("anagram", "margana") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 2
		System.out.println("\nInput Testing: anagramm and marganaa");
		System.out.println("Expercted output: Not Anagrams");
		if (isAnagram("anagramm", "marganaa") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 3
		System.out.println("\nInput Testing: Hello and hello");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("Hello", "hello") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
	}
	
	public static boolean isAnagram(String a, String b) {
		
		if(a.length() <= 50 && b.length() <=50){
			if (a.length() == b.length()){
				a = a.toLowerCase();
				b = b.toLowerCase();
				char[] str1 = a.toCharArray();
				char[] str2 = b.toCharArray();
				Arrays.sort(str1);
				Arrays.sort(str2);
				if (Arrays.equals(str1, str2)){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	
		
	}
}
