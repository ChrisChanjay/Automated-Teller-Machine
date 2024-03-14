import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionManager {
	
	private static Display display = new Display();
	
	/**
	 * 1 - Withdraw Cash
	 * 2 - Fast Cash
	 * 3 - Balance Inquiry
	 */
	private final List<Integer> transactionList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
	
	/**
	 * 1 - Withdraw
	 * 2 - Cancel transaction
	 */
	private final List<Integer> transactionAction = new ArrayList<Integer>(Arrays.asList(1, 2));
	
	/**
	 * 1 - Yes (Printing transaction info)
	 * 2 - No  (Continue w/o printing receipt)
	 */
	private final List<Integer> printReceiptAction = new ArrayList<Integer>(Arrays.asList(1, 2));
	
	/**
	 * 1 - Exit (End program) 
	 * 2 - Creating another transaction
	 */
	private final List<Integer> successAction = new ArrayList<Integer>(Arrays.asList(1, 2));
	
	
	public void processTransaction() {
		display.printInputTransaction();
		
		InputHandler input = new InputHandler();
		Integer selectedTransaction = input.processTransactionInput();
		if (selectedTransaction == null) {
			display.printInputTypeErrorMsg();
		} else {
			validateInputtedTransaction(selectedTransaction);
		}
	}
	
	private void validateInputtedTransaction(int transaction) {
		if (transactionList.contains(transaction)) {
			display.printInputAmount();
		} else {
			display.printInputNotFoundErrorMsg();
		}
	}

}
