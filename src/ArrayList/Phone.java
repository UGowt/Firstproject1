package ArrayList;

public class Phone {
	private String brand;
	private int price ;
	private String color;
	private float rate; 
	private  int editionYear;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getEditionYear() {
		return editionYear;
	}
	public void setEditionYear(int editionYear) {
		this.editionYear = editionYear;
	}
	public Phone(String brand, int price, String color, float rate, int editionYear) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.rate = rate;
		this.editionYear = editionYear;
	}
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + ", color=" + color + ", rate=" + rate + ", editionYear="
				+ editionYear + "]";
	}
	
	
	
}
