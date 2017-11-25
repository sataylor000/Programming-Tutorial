/**
 * 
 */
package helloWorldString;

/**
 * @author Scott
 *
 */
public class HelloWorldWithString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Sample string variable
		String sample = "Dog";  // You'll see a marker on the left-hand side saying that this variable is unused.  That's ok.  It's intentional.

		// To do:  Define a string x that contains the word "Hello"
		String x = "Hello";
		
		// To do:  Define a string y that contains the word "World"
		String y = "World";
		
		// To do:  By looking at the documentation for this exercise,
		// create a print statement that prints "Hello, World!" using the above variables
		// plus any string literals (or additional variables) to represent the extra comma/space/exclamation marks
		// Use the concatenation operation as needed (the plus sign) to merge everything together in the print statement.
		System.out.println(x + ", " + y + "!");
		
		// Bonus:  Try printing a couple other lines of text.  Notice each print ends up on a separate line.
		//         You can avoid the "new line" by just using .print() instead of .println()... try it and see what happens!
		System.out.println("This is a second line of text referring to my pet " + sample);
		System.out.print("This is the first part");
		System.out.print(" and this is the second part of a line");
		
	}

}
