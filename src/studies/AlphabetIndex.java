package studies;

import java.util.HashMap;
import java.util.Map;

public class AlphabetIndex {

	public static void main (String[] args) {
				
		String given = "Hello world Java!";
		
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		dictionary.put("a", 0);
		dictionary.put("b", 1);
		dictionary.put("c", 2);
		dictionary.put("d", 3);
		
		String[] givenAsArray = given.split("");
		
		for (int i = 0; i < givenAsArray.length; i++) {
			
			Integer valueFromDictionary = dictionary.get(givenAsArray[i]); 
			
			if (valueFromDictionary != null) { 
				givenAsArray[i] = String.valueOf(valueFromDictionary); 
			}
			
			System.out.print(givenAsArray[i]);
		}
	}
}