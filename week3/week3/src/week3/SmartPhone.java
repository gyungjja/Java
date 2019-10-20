package week3;

public class SmartPhone extends Phone {
	private String memory;	//메모리 크기
	private boolean hasBluetooth;	//블루투스지원여부
	
	SmartPhone(){
		this("0",false);
	}
	SmartPhone(String memory,boolean hasBluetooth){
		this.memory = memory;
		this.hasBluetooth = hasBluetooth;
	}
	SmartPhone(String memory){
		super.setMaker(memory);
	}
	
	
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public boolean getHasBluetooth() {
		return hasBluetooth;
	}
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	@Override
	public String toString() {
		return "SmartPhone [memory=" + memory + ", hasBluetooth=" + hasBluetooth + "]";
	}
	
	

}
