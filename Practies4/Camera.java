package Practies4;

public class Camera {
	private String brand;
	private int price;
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
	public Camera(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public String toString() {
		return "Camera1 brand=" + brand + ", price=" + price;
	}
	
	
		
}
