package week10;
import java.util.Random;
public class Die {
	
	Random num = new Random(3);
	int number = (int)(Math.random()*6)+ 1;
	
	
	@Override
	public String toString() {
			return "Die [number=" + number + "]";
	}
	
	/*
	Die(){
		
	}
	Die(int n){
		this.number = n;
	}
	*/
	
	
}
