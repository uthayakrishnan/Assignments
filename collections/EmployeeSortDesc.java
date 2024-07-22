package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q70
public class EmployeeSortDesc {
	
	public static void main(String[] args) {
		List <Employee>  al = new ArrayList< > ();
		al.add(new Employee(102, "sam", 2000));
		al.add(new Employee(103,"ram" ,  3000));
		al.add(new Employee(101, "shyam",  10000));
		al.add(new Employee(104,  "sameer", 40000));
		Collections.sort(al);
		Collections.reverse(al);
		//sort list in desc order of id's using sort method and Comparable
		
		for (Employee employee : al) {
			
			System.out.println(employee.getId()+ " "+ employee.getName() +""+ employee.getSal());
			
		}
		}

}
