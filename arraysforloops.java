import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class arraysforloops {
	static int[] ints;
	static Scanner input = new Scanner(System.in);
	static ArrayList<Integer> randomInts = new ArrayList<Integer>();

    static void AskForInput()
    {
        //ask user to input min and max values to fill
        //the integer array with random numbers
        System.out.println("input the minimum value for your range of randomly generated numbers");
        int minVal = input.nextInt();
        System.out.printf("Integer selected for minimum value was: %d\n", minVal);

        System.out.println("input the maximum value for your range of randomly generated numbers");
        int maxVal = input.nextInt();
        System.out.printf("Integer selected for maximum value was: %d\n", minVal);

        //rewriting our integer array with a range of numbers
        for (int i = minVal; i <= maxVal; i++)
        {
        	randomInts.add(i);
        }
        
        Random rand = new Random();
        System.out.println("Random Number: " + randomInts.get(rand.nextInt(maxVal - 1)));
        
        //output ints on same line
        for (int i = 0; i < randomInts.size(); i++)
        {
           System.out.println(randomInts.get(i) + " ");
            if (i == randomInts.size())
                System.out.println("We reached the end of the integer array");
        }
    }

    public static void main(String[] args)
    {
        ints = new int[50];

        //generate ints based on increment times 100
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = i * 100;
        }
        
        //shuffling the array
        shuffleArray(ints);

        //now output all the ints on a continuous line
        for (int i = 0; i < ints.length; i++)
        {
           System.out.println(ints[i] + " ");
            if (i == ints.length)
                System.out.println("We reached the end of the integer array");
        }

        //call method to ask user for input
        AskForInput();
        
        input.close();
    }

    //Fisher�Yates shuffle
    static void shuffleArray(int[] ar)
    {
      Random rnd = new Random();
      for (int i = ar.length - 1; i >= 0; i--)
      {
        int index = rnd.nextInt(i + 1);
        // Simple swap
        int a = ar[index];
        ar[index] = ar[i];
        ar[i] = a;
      }
    }
}
