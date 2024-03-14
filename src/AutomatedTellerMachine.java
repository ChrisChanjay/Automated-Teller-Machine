
public class AutomatedTellerMachine {
	
	private static Display display = new Display();
	private static AttemptManager attemptManager = new AttemptManager();
	private static TransactionManager transactionManager = new TransactionManager();
	private static int loopTerminator = 1;
	private static boolean isTriggerProcessAttempt = true;
	private static boolean shouldShowGreetings = true;
	private static boolean shouldShowTransactions = true;
	
	public static void main(String[] args) {
		display.printAttemptCountGuide();
		
		while(loopTerminator != 0) {
			if (isTriggerProcessAttempt) {
				attemptManager.processAttempt();
			}
			
			Boolean isPinCorrect = attemptManager.isPinCorrect();
			if (isPinCorrect != null) {
				if (attemptManager.isPinCorrect()) {
					
					greetingsVisibility();
					transactionsVisibility();
					
					
					shouldShowGreetings = false;
					shouldShowTransactions = false;
					isTriggerProcessAttempt = false;
				} else {
					display.printAttemptErrorMsg();
					loopTerminator = 0;
				}
			}
		}
	}
	
	private static void greetingsVisibility() {
		if (shouldShowGreetings) {
			display.printGreetings();
		}
	}
	
	private static void transactionsVisibility() {
		if (shouldShowTransactions) {
			display.printTransactions();
			transactionManager.processTransaction();
		}
	}

}