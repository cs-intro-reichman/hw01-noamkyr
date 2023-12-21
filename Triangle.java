/*
 *
 * this program tests if three given integers form a triangle by the following steps:
 *      get the parameters from the args
 *      check every pair of sides if the sum of the lengths of any two sides is greater than the length of the remaining side
 *      check if every two sides are valid and follows the rule
 *      print the result
 */

public class Triangle {


	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // get param a from args and cast to int
		int b = Integer.parseInt(args[1]); // get param b from args and cast to int
		int c = Integer.parseInt(args[2]); // get param c from args and cast to int

		boolean check1 = (c + b) > a; // check the first pair of sides is valid
		boolean check2 = (c + a) > b; // check the second pair of sides is valid
		boolean check3 = (a + b) > c; // check the third pair of sides is valid

		boolean checkFinal = check1 && check2 && check3; // if all the check are good the value of checkFinal is true

		System.out.println(a+", "+ b+", "+c+": "+ checkFinal); // print the result as requested


	}

}
