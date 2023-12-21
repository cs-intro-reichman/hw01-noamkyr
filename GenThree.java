public class Gen3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // get param a from args and cast to int
		int b = Integer.parseInt(args[1]); // get param b from args and cast to int


		// to get the range we need to get the bigger and the smaller number by using math library
		int max = Math.max(a,b); // get the bigger number using math.max function
		int min = Math.min(a,b); // get the smaller number using math.min function

		int random_number1 = (int) (Math.random() * (max - min)) +min; // generate number 1 using math.random, casting the result to int
		int random_number2 = (int) (Math.random() * (max - min)) +min; // generate number 2 using math.random, casting the result to int
		int random_number3 = (int) (Math.random() * (max - min)) +min; // generate number 3 using math.random, casting the result to int

		// print all the 3 generated numbers
		System.out.println(random_number1);
		System.out.println(random_number2);
		System.out.println(random_number3);

		// set to variable the minimal number by using twice the library math.min: the smallest number is the smallest between number 1 and number 2, compared to number 3
		int minimal_number = Math.min(Math.min(random_number1,random_number2),random_number3);
		// print this variable
		System.out.println("The minimal generated number was "+minimal_number);
	}
}
