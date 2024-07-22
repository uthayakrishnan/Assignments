package collections;

import java.util.ArrayList;
import java.util.Collections;
//Q66
public class ArraylistReverse {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		//sort  list in descending order (use reverse function)
	}


}
