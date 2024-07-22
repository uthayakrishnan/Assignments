package collections;
import java.util.*;
//Q68
public class ArrayListComparatorAsc {
	
	public static void main(String[] args) {
		ArrayList< Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		Collections.sort(al,new MyComp());
		System.out.println(al);
	}
}
class MyComp implements Comparator<Integer>{
		@Override
		public int compare(Integer i1, Integer i2) {
		 return i1.compareTo(i2);
			 
		}
		
		
		//sort list in ascending order using Comparator
	}



