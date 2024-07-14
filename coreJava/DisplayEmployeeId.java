package coreJava;
//Q26
public class DisplayEmployeeId {
	
	public static void displayID(int id){
		System.out.println(id);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		
		Employee emp = new Employee(101, "sam" , 1000);
		//call m1 method and pass employee id as parameter
		displayID(emp.getId());
	}


}
