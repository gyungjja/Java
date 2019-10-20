package week11;

public class Job extends Thread {
	//필드
	private String name;
	private static int num;

	//생성자
	Job(){
		this("anonymous");
	}
	Job(String name){
		this.name = name;
	}
	//스레드 메소드
	public void run() {
		//Thread t = new Thread();
		try {
			Thread.sleep(500);
			System.out.println(getName()+":"+getNum());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		while(true) {
			if(getNum() == 10)
				break;
			
			
		}
	}
	//getNum() (한 순간에 하나의 스레드만 접근 , num값 1증가 후 리턴
	public synchronized int getNum() {
		num++;
		return num;	
	}
}


