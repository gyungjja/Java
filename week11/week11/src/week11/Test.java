package week11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t = new Thread(new Job());
		Thread t1 = new Job("gico");//����� �޾�����
		Thread t2 = new Job("112233");
		t1.start();
		t2.start();
			

	}

}

