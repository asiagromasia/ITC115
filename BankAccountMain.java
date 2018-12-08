//add transactionFee field, toString method outcome should be : "yana, $3.09" 
public class BankAccountMain {
	public static void main (String[] args) {
		BankAccount A1 = new BankAccount("Asia", 234.01);
		BankAccount A2 = new BankAccount("Josh", 334);
		
		
	//first BankAccount	
		//checking if default transaction fee is set to 0.0
	//System.out.println(A1.setTransactionFee(5));  
		System.out.println(A1.toString());
		System.out.println(A1.deposit(67));
		//checking if prints current balance after deposit
		System.out.println(A1.toString());
		System.out.println(A1.withdraw(20));
		//checking if prints current balance after deposit and withdraw
		System.out.println(A1.toString());
		
		
	//	second BankAccount	
		System.out.println();
		System.out.println(A2.setTransactionFee(2));
		System.out.println(A2.toString());
		System.out.println(A2.deposit(67));
		System.out.println(A2.withdraw(20));
		
		
	};
}

