package studies.lesson2;

public class EndsWithString_12 {

	public static void main (String[] args) {
				
		String given = "Hello world Java!";
		String target = "ava!";
		
		Boolean endsWith = given.endsWith(target);
		
		System.out.println(endsWith.toString().toUpperCase());
	}
}