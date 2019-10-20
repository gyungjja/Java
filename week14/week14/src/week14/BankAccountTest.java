package week14;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		
		try {
			b.deposit(100);
			b.deposit(500);
			b.withdraw(800);
		} catch(NegativeBalanceException e) {
			e.
		}

	}

}
