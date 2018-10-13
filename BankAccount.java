		public class BankAccount {
	
		private int balance = 0;
	
		private static String name;
		
		public static int i;
		
		public static int j;
	
//Getter and Setter for Balance	
		public int getBalance() {
			return balance;
		}
	
		public void setBalance(int balance) {
			this.balance = balance;
		}
//Getter+Setter for deposit and Withdraw	
		public void deposit() {
			balance = balance + i;
		}
		
		public void withdraw() {
			balance = balance - j;
		}
		
		public void exit() {
			System.exit(0);
		}
//Setup so user can set there own name	
		public String getName() {
			return name;
		}
	
		public static void setName(String name) {
			BankAccount.name = name;
		}
	
		public void main(String[] args) {
			new BankAccount();
	
		}
	
	}
