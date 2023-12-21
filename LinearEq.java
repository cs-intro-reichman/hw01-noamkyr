public class LinearEq {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]); // get param a from args and cast to double
        double b = Double.parseDouble((args[1])); // get param b from args and cast to double
        double c = Double.parseDouble((args[2])); // get param c from args and cast to double

        double x = (c-b)/a; // calculate the value of x (using 3 doubles)

        // print the result at the requested format
        System.out.println(a+" * x + "+b +" = "+c);
        System.out.println("x = "+x);

    }

}

