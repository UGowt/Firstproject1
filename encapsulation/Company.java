package encapsulation;

public class Company {
	//private static final Employee  = null;
	private String name;
	private String location;
	private int noOfEmployees;
	private boolean isGood;
	private Employee employee;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLocation (String location) {
		this.location=location;
	}
	public String getLocation () {
		return location;
	}
	public void setnoOfEmployees(int noOfEmployees) {
		this.noOfEmployees= noOfEmployees;
	}
	public int getnoOfEmployees() {
		return noOfEmployees;
	}
	public void setisGood(boolean isGood) {
		this.isGood=isGood;
	}
	public boolean getisGood() {
		return isGood;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
		
	}
}
