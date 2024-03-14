
public class Display {
	
	private final Account account = new Account();
	
	public void printInputNotFoundErrorMsg() {
		System.out.print("\nInput not found in items!");
	}
	
	public void printInputTypeErrorMsg() {
		System.out.print("Invalid input!\n");
	}
	
	public void printInputPin() {
		System.out.print("Enter your PIN number: ");
	}
	
	public void printAttemptCountGuide() {
		System.out.print("You have 3 attempts\n\n");
	}
	
	public void printAttemptErrorMsg() {
		System.out.print("\nYou reached the maximum attempt!");
	}
	
	public void printGreetings() {
		System.out.print("\nGood day " + account.getName() + "!\n");
	}
	
	public void printTransactions() {
		System.out.print(
					"\n[1] Withdraw Cash\n" +
					"[2] Fast Cash\n" +
					"[3] Balance Inquiry\n"
				);
	}
	
	public void printInputTransaction() {
		System.out.print("\nChoose transaction: ");
	}
	
	public void printInputAmount() {
		System.out.print("\nInput amount: ");
	}
	
	public void printTransactionAction() {
		System.out.print(
					"[1] Withdraw\n" +
					"[2] Cancel transaction\n"
				);
	}
	
	public void printAskReceipt() {
		System.out.print("Print receipt?\n");
	}
	
	public void printReceiptAction() {
		System.out.print(
				"[1] Yes\n" +
				"[2] No\n"
			);
	}
	
	public void printInputReceiptAction() {
		System.out.print("Input printing action: ");
	}
	
	public void printSuccessAction() {
		System.out.print(
				"[1] Exit\n" +
				"[2] Create another transaction\n"
			);
	}
	
	public void printReceipt() {
		System.out.print(
					"Branch: " 			  + account.getBranch() 		+ "\n" +
					"Card number: " 	  + account.getCardNumber() 	+ "\n" +
					"Transaction No: "    + account.getTransactionNo() 	+ "\n" +
					"Amount withdraw: "   + account.getAmountWithdraw() + "\n" +
					"Available balance: " + account.getBalance()		+ "\n" +
					"Total: "			  + (account.getBalance() + account.getAmountWithdraw())
				);
	}

}
