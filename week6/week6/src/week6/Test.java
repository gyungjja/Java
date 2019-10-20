package week6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] p = new Person[6];
		p[0] = new Person();
		p[1] = new Person("benny",20);
		p[2] = new Student();
		p[3] = new Student("2015",3,"1");
		p[4] = new Staff();
		p[5] = new Staff(8,"2","2");
		
		for(Person obj : p)
			System.out.println(obj);
		
	}
}
