package week13;

public class Student {
	//이름, 전화번호
	String name;
	String pnumber;
	
	Student(){
		this("none","none");
	}
	
	Student(String n , String p){
		this.name = n;
		this.pnumber = p;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", pnumber=" + pnumber + "]";
	}
	
	

}

