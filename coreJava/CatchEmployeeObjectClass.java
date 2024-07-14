package coreJava;

//Q31
public class CatchEmployeeObjectClass {
	
	public static Object returnEmployeeObj(){
		//create Employee object here and return
		//don’t change m1 method prototype i.e return type or access specifier
		Employee emp = new Employee(101, "sam" ,1000);
		return emp;
	}
	
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
		Employee emp = (Employee) returnEmployeeObj();
		System.out.println(emp.getId()+ "  " +emp.getName()+ "  " +emp.getSal());		
	}


}
