package coreJava;

//Q33
public class ShowProcessEmployeeClass {
	
	public static void show(Employee emp){
		
		System.out.println(emp.getId()+ "  " +emp.getName()+ "  " +emp.getSal());
	}
	public static void process(Employee emp){
		
		emp.setId(100);
		emp.setName("sam");
		emp.setSal(1000);
		show(emp);
		
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		Employee emp = new Employee();
		process(emp);
		//add data into that empty object using process method
		//display employee object with data in show method
	}


}
