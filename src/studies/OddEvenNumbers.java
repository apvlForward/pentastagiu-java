package studies;

public class OddEvenNumbers {

	public static void main (String[] args) {
				
		int[] numbers = {13,20,14,5,2,8};
		
		int oddNumbers = 0;
		int evenNumbers = 0;
			
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] %2 == 0) {
				evenNumbers++;
			}
			else {
			oddNumbers++;
			}
		}
		
		System.out.println("Odd numbers: " + oddNumbers);
		System.out.println("Even numbers: " + evenNumbers);
		
		
	}
}