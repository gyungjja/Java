package week6;

import java.util.Random;
public class Student extends Person implements IJob,IPin{
	//필드: enter(입학년도),pay
	String enter;
	double pay;
	
	//생성자:enter,일한시간 변수사용 학번 구현
	Student(){
		this("0",0.0,"0");
	}
	Student(String enter,double hour,String num){
		//super();
		this.enter = enter;
		this.pay = getPay(hour);
		this.num = enter + getPin();
	}
	/*
	Student(String name, int age, int num,int enter){
		super();
		this.enter = enter;
	
		
	}
	*/
	//인터페이스 추상메서드
	public double getPay(double hour) {
		return hour*7000;
	}
	
	public int getPin() {
		return (int)(10+99*Math.random());
	}
	@Override
	public String toString() {
		return "Student [enter=" + enter + ", pay=" + pay + ", num=" + num + "]";
	}
	
	//메서드 : toString
	

}
