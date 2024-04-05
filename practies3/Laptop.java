package practies3;

public class Laptop {
	private int price;
	private String brand;
	private Camera camera;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Laptop(int price, String brand, Camera camera) {
		this.price = price;
		this.brand = brand;
		this.camera = camera;
	}
	public String toString() {
		return "Laptopprice=" + price + ", brand=" + brand + camera;
	}
	
}
