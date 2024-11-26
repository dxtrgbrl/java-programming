import java.util.Scanner;

public class Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);

		int number1; // first number to compare
		int number2; // second number to compare

		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user

		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);

		String str1; // first string to compare
		String str2; // second string to compare

		System.out.print("Enter first string: "); // prompt
		str1 = input.next(); // read first number from user

		System.out.print("Enter second string: "); // prompt
		str2 = input.next(); // read second number from user

		if (str1 == str2)
			System.out.printf("%s == %s\n", str1, str2);
		if (str2.equals(str1))
			System.out.printf("%s equals %s\n", str1, str2);

		input.close(); // close the input stream
	}

}
