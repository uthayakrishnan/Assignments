package coreJava;
//Q25
public class DisplayEmployeeClass {
	
	public static void showEmployee(Employee emp){
		//display employee data here
		System.out.println(emp.getId()+ "  " +emp.getName()+ "  " +emp.getSal());
		
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Employee emp = new Employee(101, "sam" , 1000);
		
		//call m1 method by passing this Employee object
		showEmployee(emp);
	}


}
