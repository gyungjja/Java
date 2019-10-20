package week14;

public class BankAccount {
	private int balance; // �ܾ�
	
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
		return "���� = " + amount +"," + "�ܰ� = "+ balance;
	}
	
	public String withdraw(int amount) throws NegativeBalnaceException {
		if(amount <= balance) {
			balance -= amount;
			return "�ܰ�=" + balance;
		}
		if(amount > balance) 
			throw new NegativeBalnaceException("���"+amount+","+"�ܰ� �����Դϴ�.");
		return "�ܰ�= " + balance;
	}
}

