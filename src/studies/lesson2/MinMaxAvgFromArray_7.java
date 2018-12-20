package studies.lesson2;

import java.util.Locale;

public class MinMaxAvgFromArray_7 {

	public static void main (String[] args) {
				
		int[] numbers = {13,20,14,5,2,8};
		
		int min = numbers[0];	
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		int max = numbers[0];	
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
				
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println(String.format(Locale.US, "Avg: %.1f", (float) sum/numbers.length));
	}
}