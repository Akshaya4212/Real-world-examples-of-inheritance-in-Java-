package device;


class BankAccount{
	String AccountHolder;
	double balance;
	
	void Deposit(double amount){
		balance += amount;
		System.out.println("Deposited:" + amount);
	}
	
	void DisplayBalance() {
		System.out.println(AccountHolder + "'s Balance: "+ balance);
	}
}


class SavingsAccount extends BankAccount{
	
	void AddInterest() {
		double interest = balance*0.05;
		balance += interest;
		System.out.println("Interest added :" + interest);
	}
}
public class Main {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.AccountHolder = "Akshaya";
		sa.Deposit(10000);
		sa.AddInterest();
		sa.DisplayBalance();
	}

}
