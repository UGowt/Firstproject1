package constructorToString;

public class Battary {
	private  String capacity;
	private boolean isLithyam;
	
	public void setcapacity(String capacity) {
		this.capacity= capacity;
	}
	                                                                 
	public String getcapacity() {
		return capacity;
	}
	public void setLithyam (boolean isLithyam) {
		this.isLithyam=isLithyam;
		
	}
	public boolean getLithiyam(boolean isLithyam) {
		return isLithyam;
		
	}
	
	public Battary(String capacity,boolean isLithyam) {
		this.capacity=capacity;
		this.isLithyam=isLithyam;
	}
	public String toString() {
		return capacity+ " "+isLithyam;
	}


}
