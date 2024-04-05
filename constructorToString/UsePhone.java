package constructorToString;

public class UsePhone {
	public static void main (String[]args) {
		Battary b = new Battary("5000",true);
		Phone p = new Phone("Sony",25000,"Xperia",true,b);
		
		System.out.println(p);
		p.setprice(15000);
		//System.out.println(p);              //change the the price using setmetod and getmethod
		
		
		
	}

}
