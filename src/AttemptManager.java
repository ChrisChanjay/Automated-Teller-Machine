
public class AttemptManager {

	private int attemptCounter = 0;
	private static Display display = new Display();
	private Boolean mIsPinCorrect = null;
	
	public void processAttempt() {
		display.printInputPin();
		
		InputHandler input = new InputHandler();
		Boolean isPinCorrect = input.processPinInput();
		if(isPinCorrect == null) {
			display.printInputTypeErrorMsg();
		} else {
			validateInputtedPin(isPinCorrect);
		}
	}
	
	private void validateInputtedPin(boolean isPinCorrect) {
		if (isPinCorrect) {
			mIsPinCorrect = true;
		} else {
			attemptCounter++;
			
			if (attemptCounter == 3) {
				mIsPinCorrect = false;
			}
		}
	}
	
	public Boolean isPinCorrect() {
		return mIsPinCorrect;
	}
	
}
