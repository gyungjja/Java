package week14;

public class BankAccount {
	private int balance; // ¿‹æ◊
	
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
	
	public String deposit(int amount) {
		balance += amount;
		return "¿˙√‡ = " + amount +"," + "¿‹∞Ì = "+ balance;
	}
	
	public String withdraw(int amount) throws NegativeBalnaceException {
		if(amount <= balance) {
			balance -= amount;
			return "¿‹∞Ì=" + balance;
		}
		if(amount > balance) 
			throw new NegativeBalnaceException("√‚±›"+amount+","+"¿‹∞Ì∞° ¿Ωºˆ¿‘¥œ¥Ÿ.");
		return "¿‹∞Ì= " + balance;
	}
}

