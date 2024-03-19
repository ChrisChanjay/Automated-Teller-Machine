import java.util.Scanner;
public class WithdrawCash {

	private static AtmAccount account = new AtmAccount();
	private static int sPin = account.getPin();
	private static String name = account.getName();
	
	public static void newMain() {
		
		int mTries = 3;
		int mAttempts = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("You have 3 attempts\n");
		
		while(mAttempts < mTries) {
			System.out.print("Enter your PIN number: ");
			int attempt = in.nextInt();
			
			if(attempt == sPin) {
				
				while(true) {
					System.out.println("\nGood Day " + name + "!" + "\n");
					System.out.println("[1] Withdraw Cash");
					System.out.println("[2] Fast Cash");
					System.out.println("[3] Balance Inquiry\n");
					System.out.print("Choose Transactions: ");
					int choose = in.nextInt();
						
						switch(choose) {
							case 1:
								withdraw(in);
								break;
							case 2:
								fastCash(in);
							case 3:
								balanceIquiry(in);
						}
				}
			} else {
				mAttempts++;
				if(mAttempts == mTries) {
					System.out.print("You reached the maximum attempt");
					System.exit(0);
				}
			}
		}		
		
	}
	
	public static void withdraw(Scanner scanner) {
		
		int tries = 3;
		int attempts = 0;
		int attempt = 0;
		int currentBalance = account.getBalance();
		
		System.out.print("\nInput Amount: ");
		int amount = scanner.nextInt();
		
		System.out.print("\n[1]Withdraw\n[2]Cancel\n");
		
		System.out.print("\nChoose: ");
		int mChoose = scanner.nextInt();
		System.out.print("\n");
	
		if(mChoose == 1) {
			
			if(amount > currentBalance) {
			
				while(attempts < tries) {
					System.out.print("Enter your PIN number: ");
					attempt = scanner.nextInt();
				
					if(attempt == sPin) {
						System.out.println("\nNot Sufficient");
					
						while(true) {
								System.out.println("\n[1] Withdraw Cash");
								System.out.println("[2] Fast Cash");
								System.out.println("[3] Balance Inquiry\n");
								System.out.print("Choose Transactions: ");
								int choose = scanner.nextInt();
								
									switch(choose) {
										case 1:
											withdraw(scanner);
										case 2:
											fastCash(scanner);
										case 3:
											balanceIquiry(scanner);
									}
						}
						
					}else {
						attempts++;
						if(attempts == tries) {
							System.out.print("You reached the maximum attempt");
							System.exit(0);
						}
					}	
				}
			}
				
			if(amount <= currentBalance) {
				while(attempts < tries) {
					System.out.print("Enter your PIN number: ");
					attempt = scanner.nextInt();
					if(attempt == sPin) {
						
						int newBalance = currentBalance - amount;
						account.setBalance(newBalance);
						System.out.println("\nWithdraw Successful");
							
						System.out.print("\nPrint reciept? \n");
						System.out.print("\n-[1]Yes\n-[2]No\n");
						
						System.out.print("\nChoose: ");
						int option = scanner.nextInt();
						
						System.out.print("\n");
							
						if(option == 1) { 
							
							account.printData();
							System.out.print("Amount withdraw: " + (amount) + "\n");
							System.out.print("Available Balance: " + (account.getBalance()) + "\n");
							System.out.print("Total: " + (account.getBalance() + amount));
							System.exit(0);
							
						} else {
							
							System.out.println("[1]Exit");
							System.out.println("[2]Create another transaction");
							System.out.print("\nChoose: ");
							int choose = scanner.nextInt();
									
							if(choose == 1) {
									System.exit(0);
							} else {
								while(true) {
									System.out.println("\n[1] Withdraw Cash");
									System.out.println("[2] Fast Cash");
									System.out.println("[3] Balance Inquiry\n");
									System.out.print("Choose Transactions: ");
									choose = scanner.nextInt();
									
										switch(choose) {
											case 1:
												withdraw(scanner);
											case 2:
												fastCash(scanner);
											case 3:
												balanceIquiry(scanner);
										}
								}
							}
						}
					}else {
						attempts++;
						if(attempts == tries) {
							System.out.print("You reached the maximum attempt");
							System.exit(0);
								
						}
					}
				}
				
				}
		}else {
			
		}
	}
	
	public static void fastCash(Scanner scanner) {
		
		Scanner in = new Scanner(System.in);
		int[] cash = {1000,3000,5000,10000,20000,30000};
		int mTries = 3;
		int mAttempts = 0;
		int mChoose = 0;
		int currentBalance = account.getBalance();
		
		System.out.println("\n[0]- 1,000 [3]- 10,000");
		System.out.println("[1]- 3,000 [4]- 20,000");
		System.out.println("[2]- 5,000 [5]- 30,000");
		
		System.out.print("\nChoose: ");
		mChoose = in.nextInt();
		
		System.out.print("\n[1]Withdraw\n[2]Cancel\n");
		
		System.out.print("\nChoose: ");
		int choose = scanner.nextInt();
		System.out.print("\n");
		
		if(choose == 1) {
			if(cash[mChoose] > currentBalance) {
				
				while(mAttempts < mTries) {
					System.out.print("Enter your PIN number: ");
					int attempt = scanner.nextInt();
				
					if(attempt == sPin) {
						System.out.println("\nNot Sufficient");
					
						while(true) {
								System.out.println("\n[1] Withdraw Cash");
								System.out.println("[2] Fast Cash");
								System.out.println("[3] Balance Inquiry\n");
								System.out.print("Choose Transactions: ");
								int choice = scanner.nextInt();
								
									switch(choice) {
										case 1:
											withdraw(scanner);
										case 2:
											fastCash(scanner);
										case 3:
											balanceIquiry(scanner);
									}
						}
						
					}else {
						mAttempts++;
						if(mAttempts == mTries) {
							System.out.print("You reached the maximum attempt");
							System.exit(0);
						}
					}	
				}
			}if(cash[mChoose]  <= currentBalance ) {
				while(mAttempts < mTries) {
					System.out.print("Enter your PIN number: ");
					int attempt = in.nextInt();
				
					if(attempt == sPin) {
							
							int newBalance = currentBalance - cash[mChoose];
							account.setBalance(newBalance);
							System.out.println("\nWithdraw Successful");
							System.out.print("\nPrint reciept? \n");
							System.out.print("\n-[1]Yes\n-[2]No\n");
							
							System.out.print("\nChoose: ");
							int option = scanner.nextInt();
							
							if(option == 1) {
								
								account.printData();
								System.out.print("Amount withdraw: " + cash[mChoose] + "\n");	
								System.out.print("Available Balance: " +(account.getBalance()) + "\n");
								System.out.print("Total: " +  (account.getBalance() + cash[mChoose]));
								System.exit(0);
							} else {
								System.out.println("[1]Exit");
								System.out.println("[2]Create another transaction");
								System.out.print("\nChoose: ");
								int mOption = scanner.nextInt();
										
								if(mOption == 1) {
										System.exit(0);
								} else {
									while(true) {
										System.out.println("\n[1] Withdraw Cash");
										System.out.println("[2] Fast Cash");
										System.out.println("[3] Balance Inquiry\n");
										System.out.print("Choose Transactions: ");
										choose = scanner.nextInt();
										
											switch(choose) {
												case 1:
													withdraw(scanner);
												case 2:
													fastCash(scanner);
												case 3:
													balanceIquiry(scanner);
											}
									}
								}
							}
					
					} else {
						mAttempts++;
						if(mAttempts == mTries) {
							System.out.print("You reached the maximum attempt");
							System.exit(0);
						}
					}
				}
			}
		} else {
			
		}
	}
	
	public static void balanceIquiry(Scanner scan) {
		
		int mTries = 3;
		int mAttempts = 0;
		
		System.out.print("\n");
		while(mAttempts < mTries) {
			
			System.out.print("Enter your PIN number: ");
			int attempt = scan.nextInt();
		
			if(attempt == sPin) {
				
				System.out.print("\nYour Balance: " + account.getBalance() + "\n");
				
				System.out.println("\n[1]Exit");
				System.out.println("[2]Create another transaction");
				System.out.print("\nChoose: ");
				int choose = scan.nextInt();
				
				if(choose == 1) {
					System.exit(0);
					
				} else {
					
					while(true) {
						System.out.println("\n[1] Withdraw Cash");
						System.out.println("[2] Fast Cash");
						System.out.println("[3] Balance Inquiry\n");
						System.out.print("Choose Transactions: ");
						choose = scan.nextInt();
					
							switch(choose) {
								case 1:
									withdraw(scan);
								case 2:
									fastCash(scan);
								case 3:
									balanceIquiry(scan);
							}
					}
				}
			}else {
				mAttempts++;
				if(mAttempts == mTries) {
					System.out.print("You reached the maximum attempt");
					System.exit(0);
				}
			}
		}
	}
}
