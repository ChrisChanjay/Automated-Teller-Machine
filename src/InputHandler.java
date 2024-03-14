import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
	
	private final Account account = new Account();
	private final Scanner in = new Scanner(System.in);
	
	public Boolean processPinInput() {
		try {
			int input = in.nextInt();
			if (input == account.getPin()) {
				return true;
			} else {
				return false;
			}
		} catch(InputMismatchException ex) {
			return null;
		}
	}
	
	public Integer processTransactionInput() {
		try {
			int input = in.nextInt();
			return input;
		} catch(InputMismatchException ex) {
			return null;
		}
	}
	
}
