package studies;

public class ConcatTwoArrays {

	public static void main (String[] args) {
				
		int[] numbers = {1, 2, 3, 4};
		int[] numbers2 = {1, 2, 4, 3};
		
		int[] numbersConcat = new int[numbers.length + numbers2.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbersConcat[i] = numbers[i];
		}
		
		for (int i = 0; i < numbers2.length; i++) {
			numbersConcat[i+numbers.length] = numbers2[i];
		}
		
		for (int i = 0; i < numbersConcat.length; i++) {
			System.out.print(numbersConcat[i] + " ");
		}
	}
}