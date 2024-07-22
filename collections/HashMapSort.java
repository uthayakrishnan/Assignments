package collections;
//Q85,84
import java.util.*;

public class HashMapSort {
	
	public static void main(String[] args) {
	
	HashMap <String,Integer> hashMapObj = new HashMap<>();
	hashMapObj.put("1", 22);
	hashMapObj.put("2", 25);
	hashMapObj.put("6", 23);
	hashMapObj.put("4", 45);
	List<String> keyList = new ArrayList<>(hashMapObj.keySet());
	List<Integer> ValueList = new ArrayList<>(hashMapObj.values());
	
	Collections.sort(keyList,new MapKeyCompare());
	Collections.sort(ValueList,new MapValueCompare());
	
	System.out.println("sorted Keys" +keyList);
	System.out.println("Sorted Values "+ValueList);
	}
}
class MapValueCompare implements Comparator<Integer>{
	 

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
		 
	}

	 
	
	
	//sort list in ascending order using Comparator
}
class MapKeyCompare implements Comparator<String>{
	 

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
		 
	}
	
	
	//sort list in ascending order using Comparator
}