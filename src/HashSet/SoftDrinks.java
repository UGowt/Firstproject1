package HashSet;

public class SoftDrinks {
	private String brand;
	private Float liter;
	private int price;
	private boolean isGas;
	public SoftDrinks(String brand, Float liter, int price, boolean isGas) {
		this.brand = brand;
		this.liter = liter;
		this.price = price;
		this.isGas = isGas;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getLiter() {
		return liter;
	}
	public void setLiter(Float liter) {
		this.liter = liter;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isGas() {
		return isGas;
	}
	public void setGas(boolean isGas) {
		this.isGas = isGas;
	}
	public String toString() {
		return "SoftDrinks [brand=" + brand + ", liter=" + liter + ", price=" + price + ", isGas=" + isGas + "]";
	}
	
	

}
