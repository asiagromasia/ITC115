public class BankAccount {
	private String name;
	private double balance;
	private double transactionFee;
	
	
	public BankAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		if (balance < (amount + transactionFee)){
			throw new IllegalArgumentException();
		}
		else
			balance = balance - (amount + transactionFee);
			return balance;
	}
	public double setTransactionFee(double fee) {
		if (fee >= 0.00) {
			transactionFee = fee;
		}
		return transactionFee;
	}
	//method
	public String toString() {
		String p = name + ", $" + balance;
		return p;
	}
	
}
