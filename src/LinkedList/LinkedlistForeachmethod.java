package LinkedList;
import java.util.LinkedList;
public class LinkedlistForeachmethod {
	public static void main(String[] args) {
		LinkedList<Float>value=new LinkedList<>();
		value.add(3.1f);
		value.add(7.3f);
		value.add(9.3f);
		value.add(12.7f);
		value.add(21.30f);
		value.add(8.9f);
		System.out.println(value);
		for(int i=0;i<value.size();i++) {              //Forloop
			System.out.println(value.get(i));
		}
		for(Float x:value) {
			System.out.println(x);                  //Enanched Forloop
		}
		value.forEach(c->System.out.println(c));  //ForeachSysout
		
		value.forEach(p->{
		if(p%2==0) {
			System.out.println(p);
		}
		});
	}

}
