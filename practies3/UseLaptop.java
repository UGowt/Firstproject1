package practies3;

public class UseLaptop {
	public static void main(String [] args) {
		Camera c = new Camera ("21mb",true);
		Laptop l = new Laptop(35000,"HP",c);
		System.out.println(l);
	}

}
