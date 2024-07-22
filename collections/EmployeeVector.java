package collections;
//Q62
import java.util.*;


//create five Employee objects here
//add those objects in Vector
//display object data from Vector using Enumeration

public class EmployeeVector {
	
	public static void main(String[] args){
	Employee emp1 = new Employee(101, "sam", 1000);
	Employee emp2 = new Employee(102, "tom", 2000);
	Employee emp3 = new Employee(103, "ram", 3000);
	Employee emp4 = new Employee(104, "harry", 1000);
	Employee emp5 = new Employee(105, "henry", 3000);

	Vector<Employee> employeeVector = new Vector<Employee>();
	employeeVector.add(emp1);
	employeeVector.add(emp2);
	employeeVector.add(emp3);
	employeeVector.add(emp4);
	employeeVector.add(emp5);
	
	Enumeration<Employee> enumeration = Collections.enumeration(employeeVector);
	 while (enumeration.hasMoreElements()) {
		 Employee emp = enumeration.nextElement();
         System.out.println(emp.getId()+""+emp.getName()+""+emp.getSal());
     }
	
	}

}
