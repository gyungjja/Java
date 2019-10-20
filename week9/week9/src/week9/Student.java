package week9;

public class Student {
	private String name;
	private String pnumber;
	
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
