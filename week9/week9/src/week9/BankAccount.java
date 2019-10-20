package week9;

public class BankAccount {
	private int balance;
	
	BankAccount(){
		this(0);
	}
	
	BankAccount(int b){
		this.balance = b;
	}
	//getter
	public int getBalance() {
		return balance;
	}
	//setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//입금 메서드
	public String deposit(int amount) {
		balance += amount;
		return "저축 = " + amount +"," + "잔고 = "+ balance;
	}
	//출금 메서드
	public String withdraw(int amount) throws NegativeBalanceException {
		
		if(amount <= balance) {
			balance -= amount;
			return "잔고=" + balance;
		}
		else if(amount > balance) {
			throw new NegativeBalanceException("출금 "+amount+","+"잔고가 음수입니다.");
		}
		return "잔고 = " + balance;
					
	}

}
