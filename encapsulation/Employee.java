package encapsulation;

public class Employee {
	private String name;
	private int Id;
	private  int salary;
	
public void setName(String name) {
	this.name=name;
	
}
public String getName() {
	return name;
}
public void setId(int Id) {
	this.Id=Id;
}
public int getId() {
	return Id;
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getSalary() {
	return salary;
}
}