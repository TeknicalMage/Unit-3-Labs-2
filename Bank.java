import java.util.Scanner;

public class Bank {
	public static BankAccount AC = new BankAccount();
	
	public static String a;
	//Starts out with name and it isn't in the loop 
	public Bank() {
		System.out.println("Type your name");
		name();
		System.out.println(" Welcome to the command line Bank");
		main();
	}
	//Strings and If statement for navigation within the program
	public static void main() {
		System.out.println("Type balance, deposit, withdraw, name, or exit");
		Scanner input = new Scanner(System.in);
		String b = input.nextLine();
		String balance = "balance";
		String deposit = "deposit";
		String withdraw = "withdraw";
		String exit = "exit";
		String name = "name";
		if(b.equals(balance)) {
			balance();
		}else if(b.equals(deposit)) {
			deposit();
		}else if(b.equals(withdraw)) {
			withdraw();
		}else if(b.equals(exit)) {
			exit();
		}else if(b.equals(name)){
			rname();		
		}else{
			System.out.print("I N V A L I D");
			main();
		}
	}
	public static void name() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		a = input.nextLine();
		AC.setName(a);
		System.out.print(AC.getName());
	}
	
	public static void deposit() {
		System.out.println("Type the amount you wish to deposit");
		Scanner input = new Scanner(System.in);
		AC.i = input.nextInt();
		AC.deposit(); 
		System.out.println(AC.getBalance());
		main();
	}
	
	public static void withdraw() {
		System.out.println("Type the amount you wish to Withdraw");
		Scanner input = new Scanner(System.in);
		AC.j = input.nextInt();
		AC.withdraw(); 
		if (AC.getBalance() < 0) {
			System.out.println("Test");
			AC.setBalance(AC.getBalance()+AC.j);
			System.out.println("Account Overdrawn. Please Try again");
			main();
		}else {
		System.out.println(AC.getBalance());
		main();
		}
	}
	
	public static void balance() {
		System.out.println("Below is your current Balance"); 
		System.out.println(AC.getBalance());
		main();
	}
	
	public static void exit() {
		System.out.println("Thank you for your money"); 
		System.out.println(AC.getBalance());
	}
	
	public static void rname() {
		System.out.println(a);
		main();
	}
	
	public static void main(String[] args) {
		new Bank();

	}
}
