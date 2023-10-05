package week4.day1HomeAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		// Declare the string
		String companyName = "google";
		
		// Convert string into toCharArray
		char[] charArray = companyName.toCharArray();
		
		// Create set to store unique characters
		Set <Character> uniq = new LinkedHashSet<Character>(); 
		
		// Iterate through each character
		for (Character ch : charArray) {
		
	    // Add each character into the set
		uniq.add(ch);
		}
		// Print the required output
		System.out.println("Required output is :"+ uniq);
	}

}
