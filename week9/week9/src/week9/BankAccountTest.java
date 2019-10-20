package week9;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		try {
			System.out.println(b.deposit(100));
			System.out.println(b.deposit(500));
			System.out.println(b.withdraw(800));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("¿‹∞Ì = " + b.getBalance());
		}
		
	}

}