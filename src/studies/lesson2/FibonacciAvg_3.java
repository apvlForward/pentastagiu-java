package studies.lesson2;

public class FibonacciAvg_3 {

	public static void main (String[] args) {
		
		int targetNumber = 20;
				
		int[] numbers = new int[targetNumber];
		numbers[0] = 1;
		numbers[1] = 1;
		int sum = 2;
		
		
		for (int i = 2; i < targetNumber; i++) {
			
			numbers[i] = numbers[i-2] + numbers[i-1];
			sum += numbers[i];
		}
		
		
		for (int i = 0; i < targetNumber; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\nAvg: " + (float) sum/targetNumber);
	}
}