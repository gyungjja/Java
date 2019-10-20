package week4;

public class Cat extends Animal {
	//static 변수 필요
	private static int count;
	private String name;
	//생성자
	Cat(){
		this("anonymous");
	}
	Cat(String name){
		this.name = name;
	}
	
	public void sound() {
		System.out.println("야~옹");
		count++;
	}
	public static int getCountCat() {
		return count;
	}
	@Override
	public String toString() {
		return name+"고양이";
	}

}
