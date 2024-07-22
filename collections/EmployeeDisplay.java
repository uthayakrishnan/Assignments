package collections;
//Q63

import java.util.ArrayList;

//create five Employee objects here
//add those objects in ArrayList
//pass this ArrayList to display function

public class EmployeeDisplay {
	
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
		display(employeeList);
		
	}
	
		public static void display(ArrayList<Employee> employeeList){
			//do required changes to display method
			//display ArrayList data here
		

		  for(int i=0;i<employeeList.size();i++) {
		  System.out.println(employeeList.get(i).getId()+ " " +
		  employeeList.get(i).getName()+" " +employeeList.get(i).getSal() ); }
		 

	}

}
