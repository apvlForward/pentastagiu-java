package studies;

public class TwoArraysEqual {

	public static void main (String[] args) {
				
		int[] numbers = {1, 2, 3, 4};
		int[] numbers2 = {1, 2, 4, 3};
		
		Boolean arraysEqual = false;
		
		if (numbers.length == numbers2.length) {
		
			if (numbers.length == 0) {
				arraysEqual = true;
			}
			else {
				
				boolean pairEqual = true;
				for (int i = 0; i < numbers.length; i++) {
					if (numbers[i] != numbers2[i]) {
						pairEqual = false; 
						break;
					}
				}
				arraysEqual = pairEqual;
			}
		}
		
		System.out.println(arraysEqual.toString().toUpperCase());
	}
}