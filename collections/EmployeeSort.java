package collections;
import java.util.*;
//Q69
public class EmployeeSort   {
	public static void main(String[] args) {
		List <Employee>  al = new ArrayList< > ();
		al.add(new Employee(102, "sam", 2000));
		al.add(new Employee(103,"ram" ,  3000));
		al.add(new Employee(101, "shyam",  10000));
		al.add(new Employee(104,  "sameer", 40000));
		Collections.sort(al);
		//sort list in ascending order of id's using sort method and Comparable
		
		for (Employee employee : al) {
			
			System.out.println(employee.getId()+ " "+ employee.getName() +""+ employee.getSal());
			
		}
		}

 
}
