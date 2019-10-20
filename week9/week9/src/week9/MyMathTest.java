package week9;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {1,2,3,4,5,6};
		
		MyMath<Integer> m = new MyMath<Integer>();
		System.out.println(m.getAverage(list));
	}

}
