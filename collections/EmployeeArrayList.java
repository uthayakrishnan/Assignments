package collections;
//Q60
import java.util.ArrayList;

public class EmployeeArrayList {

	//create five Employee objects here
	//add those objects in ArrayList
	//display object data from ArrayList using for loop

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "sam", 1000);
		Employee emp2 = new Employee(102, "tom", 2000);
		Employee emp3 = new Employee(103, "ram", 3000);
		Employee emp4 = new Employee(104, "harry", 1000);
		Employee emp5 = new Employee(105, "henry", 3000);

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		
		  
		  for(int i=0;i<employeeList.size();i++) {
		  System.out.println(employeeList.get(i).getId()+ " " +
		  employeeList.get(i).getName()+" " +employeeList.get(i).getSal() ); }
		 

	}
}
