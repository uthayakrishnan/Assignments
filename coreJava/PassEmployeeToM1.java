package coreJava;
//Q21
public class PassEmployeeToM1{
	
	public static void m1EmpMethod(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee emp = new Employee();
		m1EmpMethod(emp);
	}


}
