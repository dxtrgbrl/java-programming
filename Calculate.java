
public class Calculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum;
		int x;

		x = 1; // initialize x to 1 for counting
		sum = 0; // initialize sum to 0 for totaling

		x++; // increment the value by 1
		x--; // equivalent to X = X-1 and this decrements the value by 1

		++x; // increment the value by 1
		--x; // equivalent to X = X-1 and this decrements the value by 1

		while (x <= 10) // while x is less than or equal to 10
		{
			sum += x; // add x to sum
			++x; // increment x
		} // end while

		System.out.printf("The sum is: %d\n", sum);
	}

}
