package ArrayList;
import java.util.*;

public class UsePhone {
	public static void main(String[] args) {
		Phone p1 = new Phone("oppo",15000,"white",6.5f,2013);
		Phone p2 = new Phone("vivo",17000,"black",7.0f,2014);
		Phone p3 = new Phone("apple",49000,"gold",10f,2003);
		Phone p4 = new Phone("poco",19000,"silver",4.5f,2019);
		Phone p5 = new Phone("redmi",32000,"green",9f,2018);
		
		ArrayList <Phone> a = new ArrayList<>();
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		for(Integer i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		for(Phone x :a) {
			if(x.getPrice()>30000&&x.getPrice()<50000) {
				System.out.println(x);
			}
		}
		ArrayList<Phone> newPhone =new ArrayList<>();
		
		a.forEach(z->{
			if(z.getEditionYear()>2017) {
				newPhone.add(z);
				//System.out.println(newPhone);                 //edition Year more then 2017
			}
		});
		System.out.println(newPhone);
		
		a.forEach(p->{
			if(p.getRate()>8) {
				p.setPrice(p.getPrice()+(p.getPrice()*25/100));            //foreach  loop
			}
		});
		a.forEach(p->System.out.println(p));
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getRate()>8) {
				a.get(i).setPrice(a.get(i).getPrice()+(a.get(i).getPrice()*25/100));
			}
			
		}
		System.out.println(a);
		
		
  }
}