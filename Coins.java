public class Coins {

	public static void main(String[] args) {
		// get param coins using args, and casting to integer
		int coins = Integer.parseInt(args[0]);

		int quarters = coins/25; // get the number of quarters, 1 quarter = 25 cents
		int cents  = coins%25; // get the remainder using %
		// print the result as requested
		System.out.println("Use "+ quarters +" quarters and "+ cents + " cents");
	}

}
