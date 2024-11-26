import java.util.Scanner;

public class switcher {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strContinueYN;
        boolean blnContinueYN = true;

        do {
            System.out.print("Do a calculation [ y or n  ] ==> ");
            strContinueYN = input.nextLine();

            switch (strContinueYN) {
                case "y":
                case "Y":
                    blnContinueYN = true;
                    break;
                case "n":
                case "N":
                    blnContinueYN = false;
                    break;
                default:
                    strContinueYN = "error";
                    break;
            }// switch close

        } while (strContinueYN.equals("error"));

        System.out.printf("The choice was %b", blnContinueYN);

        input.close();

    }

}
