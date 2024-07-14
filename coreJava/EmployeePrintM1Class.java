package coreJava;
//Q24
public class EmployeePrintM1Class {
	
	public static void showM1(Employee e){
		//display data here
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee emp = new Employee();
		showM1(emp);
	}


}
