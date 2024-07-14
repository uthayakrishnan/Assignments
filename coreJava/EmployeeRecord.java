package coreJava;
//Q30
public class EmployeeRecord {
	
	public static Employee addEmployeeRecord(){
		//create Employee object here and return
		//do required changes in m1 method to do this task
		Employee emp = new Employee(101, "sam" ,1000);
		return emp;
		
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
		Employee emp = addEmployeeRecord();
		System.out.println(emp.getId()+ "  " +emp.getName()+ "  " +emp.getSal());			
		
	}
}
