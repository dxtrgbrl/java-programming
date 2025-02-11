import java.util.Scanner; // program uses class Scanner

public class GradeBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		determineClassAverage();
	}

	// display a welcome message to the GradeBook user
	public void displayMessage() {
		// getCourseName gets the name of the course
		// System.out.printf( "Welcome to the grade book for\n%s!\n\n", getCourseName()
		// );
	} // end method displayMessage

	// determine class average based on 10 grades entered by user
	public static void determineClassAverage() {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		int total; // sum of grades entered by user
		int gradeCounter; // number of the grade to be entered next
		int grade; // grade value entered by user
		int average; // average of grades

		// initialization phase
		total = 0; // initialize total

		gradeCounter = 1; // initialize loop counter

		// processing phase uses counter-controlled repetition
		while (gradeCounter <= 10)// loop 10 times
		{
			System.out.print("Enter grade: "); // prompt
			grade = input.nextInt(); // input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; // increment counter by 1
		} // end while

		// termination phase
		average = total / 10; // integer division yields integer result

		// display total and average of grades
		System.out.printf("\nTotal of all 10 grades is %d\n", total);
		System.out.printf("Class average is %d\n", average);

		input.close();
	}
}
