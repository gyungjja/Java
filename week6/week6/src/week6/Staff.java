package week6;

public class Staff extends Person implements IJob,IPin {
	double pay;
	String count;//��������
	
	Staff(){
		this(0,"1","1");
	}
	Staff(double hour,String num,String count){
		this.pay = getPay(hour);
		this.num = count + getPin();
	}
	
	public double getPay(double hour) {
		return hour*8000;
	}
	
	public int getPin() {
		return (int)(10+99*Math.random());
	}
	@Override
	public String toString() {
		return "Staff [pay=" + pay + ", num=" + num + "]";
	}
	

	
}
