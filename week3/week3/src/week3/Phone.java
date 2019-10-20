package week3;

public class Phone {
	private String maker;	//제조사
	private int price;		//가격
	private String type;	//통신타입(2G or 3G)
	
	Phone(){
		this("none",0,"none");
	}
	Phone(String maker){
		this("KT",0,"none");
	}
	Phone(String maker, int price){
		this("SKT",200000,"3G");
	}
	Phone(String maker, int price, String type){
		this.maker = maker;
		this.price = price;
		this.type = type;
	}
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + ", type=" + type + "]";
	}
	

}
