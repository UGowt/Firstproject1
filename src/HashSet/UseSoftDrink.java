package HashSet;
import java.util.HashSet;
import java.util.Set;
public class UseSoftDrink {
	public static void main(String[] args) {
		SoftDrinks s1 = new SoftDrinks("cola",1.0f,60,true);
		SoftDrinks s2 = new SoftDrinks("fanta",2.5f,75,false);
		SoftDrinks s3 = new SoftDrinks("pepsi",1.5f,60,true);
		SoftDrinks s4 = new SoftDrinks("7UP",2.0f,60,true);
		SoftDrinks s5 = new SoftDrinks("Slice",1.5f,60,false);
		Set<SoftDrinks>s=new HashSet<SoftDrinks>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		//s.forEach(x->System.out.println(x));
		s.remove(s2);
		s.forEach(y->System.out.println(y));
	}

}
