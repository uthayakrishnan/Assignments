package collections;
import java.util.*;
//Q67
public class ArraylistComparatordesc {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		
		 
		Collections.sort(al,new MyCompare());
		System.out.println(al);
	}
}
		class MyCompare implements Comparator<Integer>{
			@Override
			public int compare(Integer i1, Integer i2) {
			 return i2.compareTo(i1);
				 
			}
		//sort list in descending order using Comparator
	}



