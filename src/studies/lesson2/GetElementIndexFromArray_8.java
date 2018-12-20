package studies.lesson2;

public class GetElementIndexFromArray_8 {

	public static void main (String[] args) {
				
		int[] numbers = {13,20,14,5,2,8};
		
		int targetNumber = 5;
		
			
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == targetNumber) {
				System.out.println("Index of " + targetNumber + " is " + i);
			}
		}
	}
}