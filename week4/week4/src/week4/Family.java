package week4;

public class Family {
	private String dad;
	private String mom;
	private String boy;
	private String girl;
	
	public Family() {
		this("none","none","none","none");
	}
	
	public Family(String d, String m , String b, String g) {
		this.dad=d;
		this.mom=m;
		this.boy = b;
		this.girl = g;
	}
	
	String operation() {
		return "통화를 합니다.";
		
	}

}
