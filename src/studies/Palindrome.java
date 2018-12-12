package studies;

public class Palindrome {

	public static void main (String[] args) {
				
		String given = "abcddcba";
		Boolean isPalindrome = true;
		
		char[] givenAsChar = given.toCharArray();
		
		int numberToGoUntil = 0;
		if (givenAsChar.length %2 == 0) {
			numberToGoUntil = givenAsChar.length / 2;
		}
		else {
			numberToGoUntil = givenAsChar.length / 2 + 1;
		}

		
		for (int i = 0; i < numberToGoUntil; i++) {
			
			System.out.println(givenAsChar[i]);
			
			if (givenAsChar[i] != givenAsChar[givenAsChar.length-1 - i]) {
				isPalindrome = false; 
				break;
			}	
		}
		
		System.out.println("Is word \"" + given + "\" a palindrome: " +  isPalindrome.toString().toUpperCase());
	}
}