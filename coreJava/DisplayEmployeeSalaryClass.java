package coreJava;

//Q9
public class DisplayEmployeeSalaryClass {
	
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		//display this object data by passing to show method
		//add 100 bonus in salary 
		//display this object data by passing to show method
		
		Employee emp = new Employee(101,"Sam",1000);
		show(emp);
		emp.setSal(emp.getSal()+100);
		show(emp);
	}
	public static void show(Employee emp){
		//do required changes in show method	
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

	}


}
