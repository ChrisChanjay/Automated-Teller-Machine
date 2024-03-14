import java.util.Random;

public class Account {
	
	private int balance = 10000;
	private int amountWithdraw = 0;
	private final String name = "Cj";
	private final String branch = "Timbao";
	private final int pin = 123456;
	private final int cardNumber = 1234567890;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAmountWithdraw() {
		return amountWithdraw;
	}

	public void setAmountWithdraw(int amountWithdraw) {
		this.amountWithdraw = amountWithdraw;
	}

	public String getName() {
		return name;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public int getPin() {
		return pin;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public String getTransactionNo() {
		return "" + new Random().nextInt(999999);
	}
	
}