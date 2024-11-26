import java.util.Scanner;


public class bankaccountmethods {

	//global variables
    static int accountNum;
    static double accountBal;
    //stats variables 
    static int numberOfDeposits, numberOfWithdrawals;
    static double averageWithdrawal, averageDeposit;
    //input scanner
    static Scanner input = new Scanner(System.in);

    public static void PerformTransaction()
    { 
        //use local variable for userResponse
        String userResponse;

        System.out.println("Would you like to perform a transaction? [Y]es or [E]xit");
        userResponse = input.next();

        while(userResponse != "E" && userResponse != "Exit" && userResponse != "e")
        {
            AccountNumber();
            DepositOrWithdrawal();

            System.out.println("Would you like to perform another transaction? [Y]es or [E]xit");
            userResponse = input.next();
        }

        OutputStats();
    }

    public static void DepositOrWithdrawal()
    {
        //use local variable for userResponse and temp to store amount for transaction
        double temp;
        char userResponse;

        do
        {
            System.out.println("[D]eposit or [W]ithdrawal?");
            userResponse = input.next().charAt(0);
        } while (userResponse != 'D' && userResponse != 'W');
                    
        if (userResponse == 'D')
        { 
            //deposit logic
            do
            {
                System.out.println("How much?");
                temp = input.nextDouble();
                if (temp > 0)
                { 
                    //only perform actions if amount is greater than zero
                    accountBal += temp;
                    averageDeposit += temp;
                    numberOfDeposits++;
                }
            }while (temp <= 0);
            //output action
            System.out.printf("Action selected: %s\nAmount: %.2f\nBalance: %.2f", userResponse, temp, accountBal);
        }
        else if (userResponse == 'W')
        { 
            //withdrawal logic
            do
            {
                System.out.println("How much?");
                temp = input.nextDouble();
                if (temp > 0 || temp <= accountBal)
                {
                    //only perform actions if amount is greater than zero and
                    //less than or equal to balance
                    accountBal -= temp;
                    averageWithdrawal += temp;
                    numberOfWithdrawals++;
                }
            } while (temp <= 0 && temp > accountBal);
            //output action
            System.out.printf("Action selected: %s\nAmount: %.2f\nBalance: %.2f", userResponse, temp, accountBal);
        }          
    }

    public static void AccountNumber()
    {
        //looking for account number from user
        do 
        {
            System.out.println("What is your account number?");
            accountNum = input.nextInt();
            
        } while (accountNum < 100 || accountNum > 200);
        
    }

    public static void OutputStats()
    {
        //outputting stats info upon program termination
        System.out.printf("Number of Deposits: %d\nAverage Deposit: %.2f\n" +
                          "Number of Withdrawals: %d\nAverage Withdrawal: %.2f",
                            numberOfDeposits, (averageDeposit / numberOfDeposits),
                            numberOfWithdrawals, (averageWithdrawal / numberOfWithdrawals));
    }

    public static void main(String[] args)
    {
        //initialize our variables
        accountNum = 0;
        accountBal = 0;
        numberOfDeposits = 0; numberOfWithdrawals = 0;
        averageDeposit = 0; averageWithdrawal = 0;

        //PerformTransaction below:
        PerformTransaction();
    }

}
