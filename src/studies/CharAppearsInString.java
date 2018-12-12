package studies;

public class CharAppearsInString {

	public static void main (String[] args) {
				
		String given = "Hello world Java!";
		char target = 'a';
		
		int numberOfTimesFound = 0;
		for (char currentChar : given.toCharArray()) {
			if (currentChar == target) {
				numberOfTimesFound++;	
			}
		}
		
		System.out.println(numberOfTimesFound);
	}
}