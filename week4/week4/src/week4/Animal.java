package week4;

public abstract class Animal {	//Animal클래스로 객체 생성을 하지 않겠다.
	String reaction(Animal ani) {
		//instanceof 사용
		if(ani instanceof Cat) {
			return "_꼬리내리고";
		}
		else {
			return "_꼬리올리고";
		}
	}
	
	public abstract void sound();

}
