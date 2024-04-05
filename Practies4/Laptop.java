package Practies4;

public class Laptop {
	private String brand;
	private int price;
	private Camera camera;
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
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public String toString() {
		return "LaptopBrand=" + brand + ", price=" + price + ", CAMERABRAND=" + camera.getBrand()+", camera Price"+camera.getPrice();
	}
	public Laptop(String brand, int price, Camera camera) {
		this.brand = brand;
		this.price = price;
		this.camera = camera;
	}
	
	
	

}
