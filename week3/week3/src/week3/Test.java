package week3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f[] = new Fruit[4];
		f[0] = new Fruit();
		f[1] = new Apple();
		f[2] = new Grape();
		f[3] = new Pear();
		
		for(Fruit a : f)
			System.out.println(a.me());

	}

}
