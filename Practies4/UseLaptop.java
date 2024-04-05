package Practies4;

public class UseLaptop {
	public static void main(String [] args) {
		Camera c1 = new Camera("canon",4500);
		Camera c2 = new Camera ("nicon",4000);
		Camera c3 = new Camera ("Sony",6500);
		Camera c4 = new Camera("Oneplus",6750);
		Camera c5 = new Camera("apple",7600);
		
		Laptop l1= new Laptop("dell",45000,c1);
		Laptop l2= new Laptop("hp",50000,c2);
		Laptop l3= new Laptop("accer",65000,c3);
		Laptop l4= new Laptop("lenovoa",54000,c4);
		Laptop l5= new Laptop("APPle",88000,c5);
		
		Camera [] cameras = {c1,c2,c3,c4,c5};
		Laptop [] laptops= {l1,l2,l3,l4,l5};
		
		for(int i=0;i<laptops.length;i++) {
			if(cameras[i].getPrice()>5000) {
				int a = ((laptops[i].getPrice()*10)/100)+laptops[i].getPrice();
				laptops[i].setPrice(a);
			}
		}
		for(int i=0;i<laptops.length;i++) {                           //camera price more than 5000
			if(laptops[i].getCamera().getPrice()>5000) {
				
			}
			System.out.println(laptops[i]);
		}
		
	}

}
