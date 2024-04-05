package encapsulation;

public class UseCompany {
	public static void main(String[]args) {
		Employee e = new Employee();
		e.setName("Gowtham");
		e.setId(27138);
		e.setSalary(650000);
		
		Company c = new Company();
		c.setName("Fujitsu");
		c.setLocation("NAVALLUR");
		c.setnoOfEmployees(1100);
		c.setisGood(true);
		c.setEmployee(e);
		
		System.out.println(c.getName()+" "+c.getLocation()+" "+c.getnoOfEmployees()+" "+c.getisGood()+" "+
		c.getEmployee().getName()+" "+c.getEmployee().getId()+" "+c.getEmployee().getSalary());
		
	}

}
