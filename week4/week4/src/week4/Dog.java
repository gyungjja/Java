package week4;

public class Dog extends Animal {
	//static 변수 필요
	private static int count;
	private String name;
	//생성자
	Dog(){
		this("anonymous");
	}
	//생성자
	Dog(String name){
		this.name = name;
	}
	//오버라이딩된 메서드
	public void sound() {
		System.out.println("멍멍");
		count++;
	}
	
	public static int getCountDog() {
		return count;
	}

	@Override
	public String toString() {
		return name+"강아지";
	}
	

}
