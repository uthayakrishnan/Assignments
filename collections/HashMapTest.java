package collections;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Q82,83,84,85
public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap <String,Integer> hashMapObj = new HashMap<>();
		hashMapObj.put("1", 22);
		hashMapObj.put("2", 25);
		hashMapObj.put("1", 22);
		hashMapObj.put("4", null);
		
		
		for (Entry<String, Integer> obj : hashMapObj.entrySet()) {
			System.out.println(obj.getKey() +"\t" +obj.getValue());
			
		}
	 
		
		HashMap <Employee,Integer> empHashMap = new HashMap<>();
		empHashMap.put(new Employee(100,"sam",1000), 2);
		empHashMap.put(new Employee(200,"ram",5000), 3);
		empHashMap.put(new Employee(400,"tom",6000), 4);
		empHashMap.put(new Employee(100,"sam",1000), 5);
		
		
		for (Entry<Employee, Integer> obj : empHashMap.entrySet()) {
			System.out.println(obj.getKey().getId()+""+obj.getKey().getName()+""+obj.getKey().getSal());
			
		}
		
	}
}
