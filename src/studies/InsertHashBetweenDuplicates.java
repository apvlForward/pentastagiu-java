package studies;

public class InsertHashBetweenDuplicates {

	public static void main (String[] args) {
				
		StringBuilder builder = new StringBuilder("Hello wwworlld Java!");
		
		for (int i = 1; i < builder.length(); i++) {
			if (builder.charAt(i-1) == builder.charAt(i)) {
				
				builder.insert(i, "#");
			}			
		}
		System.out.println(builder);
	}
}