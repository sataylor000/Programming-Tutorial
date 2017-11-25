/**
 * 
 */
package mathOps;

import java.util.Scanner;

/**
 * @author Scott
 *
 */
public class MathOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Grab the values from user console input for A and B.
		// This is similar to what we did in AbsoluteValue.
		Scanner scanner = new Scanner(System.in); // This is special code that says "I want to eventually read some user input from the console window"

		System.out.println("Enter an integer number for value a:");
		int a; // Define our "a" input as being an integer
		String input = scanner.nextLine(); // This is the special code that waits for the user to type something into the console and hit enter.
		a = Integer.parseInt(input);  // This convert the ASCII string into the actual integer value (remember ASCII from Level 1?
		                                       // Even numbers have an ASCII value.  The number 7, in ASCII, is actually 55!
		System.out.println("Enter an integer number for value b:");
		input = scanner.nextLine();  // We had already defined "input" as a String above.  You can only define it once so here we just use the variable.
		int b = Integer.parseInt(input);  // get the value for b.  Note that we both defined and set it in one line, rather than the two lines we used
		                                  // for the variable "a".  This is often simpler because it saves us a line of code.
		
		// Now that we have a and b, let's do all the calculations based on them.
		// To Do:  create variables add, sub, mul, div, and rem.  Use +, -, *, /, and % operators to calculate these values for the given a and b.
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = a % b;

		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div + " rem " + rem);

		// To Do:  Print the inputs and the results.  The output should look something like this for a=29 and b=4:
		//         29 + 4 = 33
		//         29 - 4 = 25
		//         29 * 4 = 116
		//         29 / 4 = 7 rem 1
		
		// Let's do some self-checking on that division part.
		// If a/b = c remainder d, then (c * b) + d should = a, right?


		// To Do:  Calculate the above in a variable called check_a, and print the result.
		//         Note:  just as in math class, math operations in computer programs have precedence rules!
		//                Multiplication has precedence over addition, so c * b + a is the same as (c * b) + a, but not c * (b + a).
		// Bonus: Try adding parentheses to your code as shown on the previous line and see the results of check_a change for the two options!
		//        (you could do this by changing the program and re-running, or by copying/modifying the line and printing it multiple times 
		//        and showing the results of each one all in one program...)
		int check_a      =  div *  b +  rem;
		int good_check_a = (div *  b) + rem;
		int bad_check_a  =  div * (b +  rem);
		System.out.println("     check_a = " +      check_a);
		System.out.println("good check_a = " + good_check_a);
		System.out.println("bad  check_a = " +  bad_check_a);

		scanner.close(); // This tells the program that we're done using the console scanner and it can be turned off.

	}
}
