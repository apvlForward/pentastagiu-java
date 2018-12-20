package studies.lesson2;

public class SumUpNumbers_1 {

	public static void main (String[] args) {
		
		int targetNumber = 12;
		int sum = 0;
		
		for (int i = 0; i <= targetNumber; i++) {
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
	}
}