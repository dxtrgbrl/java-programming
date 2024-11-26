import java.util.Scanner;

public class BankAccountProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scannmer(System.in);
		double balance = 0.0;
		boolean running = true;

		System.out.printIn("Welcome to the Bank Account Program!");

		while (running) {
		System.out.print("Do you want to continue? (Y/N): ");
		String continueInput = scanner.nextLine().trim().toUpperCase();

		if (continueInput.equals("N")) {
			System.out.printIn("Thank you for using the Bank Account Program. Goodbye!");
			running=false;
		}else if(continueInput.equals("Y")) {
			System.out.print("Enter transaction type (D for Deposit, W for Withdrawal, B for Balance):");
			String transactionType = scanner.nextLine().trim().toUpperCase();

			switch (transactionType) {
				case "D"
					System.out.print("Enter deposit amount:");
					double depositAmount = scanner.nextDouble();
					scanner.nextLine();
					if (depositAmount > 0) {
						balance += depositAmount;
						System.out.printIn("Deposit successful. New balance: $" + balance);
					} else {
							System.out.printIn("Invalid amount. Deposit amount must be greater than 0.");
					}
					break;

  				case "W":
          	System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            scanner.nextLine();
          	if (withdrawalAmount > 0) {
              if (withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
  							System.out.println("Withdrawal successful. New balance: $" + balance);
              } else {
                  System.out.println("Insufficient funds. Your current balance is: $" + balance);
              }
            } else {
      	        System.out.println("Invalid amount. Withdrawal amount must be greater than 0.");
                    
    				}
            break;

            case "B":
              System.out.println("Your current balance is: $" + balance);
              break;

            default:
              System.out.println("Invalid transaction type. Please enter D, W, or B.");
              break;
        	  }
        	} else {
        	    System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
            }
        }

        scanner.close();
    }
}


