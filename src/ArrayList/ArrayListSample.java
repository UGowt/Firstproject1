package ArrayList;
import java.util.*;
public class ArrayListSample {
	public static void main(String [] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(24);
		nums.add(92);
		nums.add(75);
		nums.add(37);                    //add() insert the value		
		nums.add(31);                    //set()   replace the value
		                                 //remove() delete the value
		System.out.println(nums);        //get() get by index
		nums.set(2, 21);                 //size() length
		System.out.println(nums);
		nums.remove(3);
		System.out.println(nums);
		System.out.println(nums.get(3));
		Integer a = nums.get(1);
		System.out.println(a);
		System.out.println(nums.size());
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));   // normal Forloop
		}
		for(Integer b : nums) {
			System.out.println(b);                     //enanched for loop
			
		}
		
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {                             //divisible by 2
				System.out.println(nums.get(i));
			}
		}
		
		for (Integer x : nums) {
			if(x%2!=0) {                                    // odd number using enanched for loop
				System.out.println(x);
			}
		}
		nums.forEach(c-> System.out.println(c));                                    //forEach method
		nums.forEach(p->{
			if(p %2==0) {                                                            // Using condition 
				System.out.println(p);
			}
		});
	}
}