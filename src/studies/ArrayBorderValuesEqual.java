package studies;

public class ArrayBorderValuesEqual {

	public static void main (String[] args) {
				
		int[] numbers = {1, 3, 45, 23, 12, 2};
			
		Boolean valuesEqual = (numbers[0] == numbers[numbers.length-1]);
		
		System.out.println(valuesEqual.toString().toUpperCase());
	}
}