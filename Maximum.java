import java.util.Scanner;

public class Maximum {

	int a1; // class variable

	static int s1; // static variable

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Scanner for input from command window
		Scanner input = new Scanner(System.in);

		s1 = 10;
		// prompt for and input three floating-point values
		System.out.print("Enter three floating-point values separated by spaces: ");

		double number1 = input.nextDouble(); // read first double
		double number2 = input.nextDouble(); // read second double
		double number3 = input.nextDouble(); // read third double

		int a = 10;

		// determine the maximum value
		double result = maximum(number1, number2, number3, a);

		// display maximum value
		System.out.println("Maximum is: " + result);

		input.close();
	}

	public static double maximum(double x, double y, double z, int b) {
		double maximumValue = x; // assume x is the largest to start
		// determine whether y is greater than maximumValue
		if (y > maximumValue)
			maximumValue = y;
		// determine whether z is greater than maximumValue
		if (z > maximumValue)
			maximumValue = z;
		return maximumValue;
	} // end method maximum

	public void classmethod() {
		a1 = 50;
	}

}
