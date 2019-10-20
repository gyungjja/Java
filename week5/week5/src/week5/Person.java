package week5;

public class Person implements IComparable {
	private String name;
	private double height;
	//생성자
	Person(){
		this("none",0);
	}
	Person(String n, double h){
		this.name = n;
		this.height = h;
		
	}
	
	@Override
	public String toString() {
		return "Person: Person [name=" + name + ", height=" + height + "]";
	}
	//인터페이스의 추상 메서드 구현
	//Person 객체 비교
	public int compareTo(Person other) {
		if(this.height > ((Person)other).height)
			return 1;
		else if(this.height == ((Person)other).height)
			return 0;
		else
			return -1;
	}
	

}

