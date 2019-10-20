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
	//�Ա� �޼���
	public String deposit(int amount) {
		balance += amount;
		return "���� = " + amount +"," + "�ܰ� = "+ balance;
	}
	//��� �޼���
	public String withdraw(int amount) throws NegativeBalanceException {
		
		if(amount <= balance) {
			balance -= amount;
			return "�ܰ�=" + balance;
		}
		else if(amount > balance) {
			throw new NegativeBalanceException("��� "+amount+","+"�ܰ� �����Դϴ�.");
		}
		return "�ܰ� = " + balance;
					
	}

}
