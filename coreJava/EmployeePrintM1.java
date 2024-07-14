package coreJava;

//Q23
public class EmployeePrintM1 {
	
	public static void showM1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee emp = new Employee();
		showM1(emp );
	}


}
