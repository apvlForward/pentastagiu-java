package studies.lesson2;

public class AverageAndSum_2 {

	public static void main (String[] args) {
		
		int numberFrom = 3;
		int numberTo = 10;
				
		int sum = 0;
				
		for (int i = numberFrom; i <= numberTo; i++) {
			sum += i;
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (float) (numberFrom+numberTo)/2);
	}
}