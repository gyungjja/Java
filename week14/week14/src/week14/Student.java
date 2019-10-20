package week14;

public class Student {
	private String name;
	private String phone;
	
	Student(){
		this("none","none");
	}
	
	Student(String n , String p){
		this.name = n;
		this.phone = p;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPhone(String p) {
		this.phone = p;
	}

}
