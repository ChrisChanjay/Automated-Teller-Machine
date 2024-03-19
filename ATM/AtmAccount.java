import java.util.Random;

public class AtmAccount {
	
	private String name = "Cj";
	private String branch = "Timbao";
	private int pin = 123456;
	private int balance = 10000;
	private int cardNumber = 1234567890;
	private Random transacNum = new Random();
	
	public String getName() {
		return name;
	}
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void printData() {
		
		long random = transacNum.nextInt(999999);
		System.out.println("Branch: " + branch + "\n" + "Card Number: " + cardNumber + "\n" + "Transaction Number: " + random);
	}
}
