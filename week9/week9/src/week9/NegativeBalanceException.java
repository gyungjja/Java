package week9;

public class NegativeBalanceException extends Exception {
	NegativeBalanceException() {
		
	}
	
	NegativeBalanceException(String message){
		super(message);
	}
	
}
