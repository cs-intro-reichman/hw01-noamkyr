/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String [] args){
		// get params a and b using args, and casting to integers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int sum = a + b; // set to a new variable the v value of a + b

		System.out.println(a+ " + " +b + " = "+ sum); // print the result as requested

	}
}
