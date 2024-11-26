import java.util.Scanner;

public class whilepractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userString;
        char userChar;
        int userInt;
        int userInt2;

        do
        {
            System.out.println("Input a string of A, B, C, or D, and feel free to use lower case");
            userString = input.next();
            if (userString == "A" || userString == "B" || userString == "C" || userString == "D")
                System.out.println(userString);
        } while (userString != "A" && userString != "B");

        userString = "C";

        while (userString != "A" && userString != "B")
        {
            System.out.println("Input a string of A, B, C, or D, and feel free to use lower case");
            userString = input.next();
        }

        do
        {
            System.out.println("Input a char A or B");
            userChar = input.next().charAt(0);
            if (userChar != 'A' || userChar != 'B' || userChar != 'C' || userChar != 'D')
                System.out.println(userChar);
        } while (userChar != 'A' && userChar != 'B' && userChar != 'C');

        do
        {
            System.out.println("Input an int below zero, Then below 100");
            userInt = input.nextInt();
            userInt2 = input.nextInt();
        } while (userInt > 0 && userInt2 > 100);

        do 
        {
            System.out.println("Input an int between 1-99");
            userInt = input.nextInt();
            
        }while (userInt > 0 && userInt < 100);

        boolean isTrue = true;

        do
        {
            System.out.println("Input an int below zero, Then below 100");
            userInt = input.nextInt();
            userInt2 = input.nextInt();
            if (userInt > 0 || userInt2 > 100)
            {
                isTrue = false;
                break;
            }
        } while (isTrue);    

	}

}
