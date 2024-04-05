package constructorToString;

public class Phone {
	private String brand;
	private int price;
	private String model;
	private boolean isMadeJapan;
	private Battary battary;

	public void brand(String brand) {
		this.brand = brand;
	}

	public String getbrand() {
		return brand;
	}

	public void setisMadeJapan(boolean isMadeJapan) {
		this.isMadeJapan = isMadeJapan; // ismadeJApan

	}

	public boolean getLithiyam(boolean isMadeJapan) {
		return isMadeJapan;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice(int price) { // price
		return price;
	}

	public void model(String model) {
		this.model = model;
	}

	public String getmodel() { // model
		return model;
	}

	public Phone(String brand, int price, String model, boolean isMadeJapan, Battary battary) {

		this.brand = brand;
		this.price = price;
		this.isMadeJapan = isMadeJapan;
		this.model = model;
		this.battary = battary;
	}
		
		public String toString() {
			return brand +" "+price+" "+model+" "+isMadeJapan+" "+battary;
			}
	
}