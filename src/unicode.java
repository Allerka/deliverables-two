import java.util.Scanner;

public class unicode {

	public static void main(String[] args) {
		// Initial setup
		Scanner scan = new Scanner(System.in);
		String wordOne;
		String wordTwo;
		int sumOne = 0;
		int sumTwo = 0;
		int i;
		
		// First user input
		System.out.println("We're going to add up the unicode values of two words. Give me the first word:");
		wordOne = scan.next();
		
		// Calculate first word's value
	     for (i = 0; i < wordOne.length(); i++) {
	            sumOne += wordOne.codePointAt(i);
	            System.out.println(wordOne.charAt(i) + ": " + wordOne.codePointAt(i));
	            }
	     System.out.println("Total value of " + wordOne + ": " + sumOne);
	     
	    // Second user input
	     System.out.println("Now for the second word:");
	     wordTwo = scan.next();
	     
	    // Calculate second word's value
	     for (i = 0; i < wordTwo.length(); i++) {
	            sumTwo += wordTwo.codePointAt(i);
	            System.out.println(wordTwo.charAt(i) + ": " + wordTwo.codePointAt(i));
	            }
	     System.out.println("Total value of " + wordTwo + ": " + sumTwo);
	     
	     // Calculate final difference and return
	     scan.close();
	     System.out.println("Now, let's figure out the difference.");
	     System.out.println("The difference is: " + Math.abs(sumOne - sumTwo));
	}
}
