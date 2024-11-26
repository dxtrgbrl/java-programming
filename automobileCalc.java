import java.util.Scanner;


public class automobileCalc {
	static private double dSumNewInvTot,dNewInvTot,dSumDiscGiven,dInvoiceTotal; 
    static private int nCountInv;
    static private String strInput, strName;
    static private Scanner input = null;
	
	public static void main(String[] args) {
		//declaration and initialization section
		input = new Scanner(System.in);
        dSumNewInvTot = dNewInvTot = dSumDiscGiven = dInvoiceTotal = 0.0; 
        nCountInv = 0;

        int nContinue1_2;
        do
        {
            System.out.print("Do you want to use me [1 - Manager 2 - Employee 9 - End] ==>");
            strInput = input.next();
            nContinue1_2 = Integer.parseInt(strInput);
        } while (nContinue1_2 != 1 && nContinue1_2 != 2 && nContinue1_2 != 9);


        while (nContinue1_2 != 9)
        {

            fnInputInvTotal_Name();

            fnDiscountGivenCalc();
            fnSumationSection();
            fnDisplayCalculation();

        }// while continue1_2 end
        
        DisplayInfo();
        
        input.close();
	}
	
	static void fnDisplayCalculation()
    {
        System.out.printf("Customer--> %s\n", strName);
        System.out.printf("Invoice Total ==>$%.2f\n", dInvoiceTotal);
        System.out.printf("New Invoice Total ==>$%.2f\n", dNewInvTot);

        System.out.printf("Discount Given ==>$%.2f\n\n", (dInvoiceTotal - dNewInvTot));
    }//fnDisplayCalculation close

    static void fnSumationSection()
    {
        dSumNewInvTot += dNewInvTot;
        nCountInv++;
        dSumDiscGiven = dSumDiscGiven + (dInvoiceTotal - dNewInvTot);
    }//fnSumationSection close

    static void fnDiscountGivenCalc()
    {
        if ((strName.charAt(0) >= 'A') && (strName.charAt(0) <= 'G'))
            dNewInvTot = dInvoiceTotal * .95;
        else if ((strName.charAt(0) >= 'H') && (strName.charAt(0) <= 'P'))
            dNewInvTot = dInvoiceTotal * .92;
        else if ((strName.charAt(0) >= 'Q') && (strName.charAt(0) <= 'Z'))
            dNewInvTot = dInvoiceTotal * .88;
    }//fnDiscountGivenCalc close

    static void fnInputInvTotal_Name()
    {
        do
        {

            System.out.print(" Invoice Total...$");
            strInput = input.next();
            dInvoiceTotal = Double.parseDouble(strInput);
        } while (dInvoiceTotal <= 0);

        do
        {
            System.out.print("Enter name [Please ensure a capital first letter] ==> ");
            strName = input.next(); ;
        } while (strName.charAt(0) >= 'a' && strName.charAt(0) <= 'z');

    }//fnInputInvTotal_Name close

    static int fnContinue1_2()
    {
        int nContinue1_2;
        do
        {
            System.out.print("Do you want to use me [1 - Manager 2 - Employee 9 - End] ==>");
            strInput = input.next();
            nContinue1_2 = Integer.parseInt(strInput);
        } while (nContinue1_2 != 1 && nContinue1_2 != 2 && nContinue1_2 != 9);

        return nContinue1_2;

    }//fnnContinue1_2 close

    static void DisplayInfo(){

        if(nCountInv>0){
            System.out.printf("Sum of Discount Given ==>$%.2f\n", dSumDiscGiven);
            System.out.printf("Number of customers ==> %d\n", nCountInv);
            System.out.printf("Sum of Invoice Total ==>$%.2f\n", dSumNewInvTot);
            System.out.printf("Average of Discount Given ==>$%f\n\n", (dSumDiscGiven / nCountInv));
        }else{
            System.out.print("No Data entered...");
        }

    }// DisplayInfo close    

}
