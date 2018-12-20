package studies.lesson2;

public class StringContains_10 {

	public static void main (String[] args) {
				
		String given = "Hello world Java!";
		String target = "world";
		
		Boolean contains = given.contains(target);
		
		System.out.println(contains.toString().toUpperCase());
	}
}