package coreJava;

public class EmployeeMain {
 
	public static void main(String[] args) {
		//Q2
		//here create object of Employee class and add 101,sam,1000 data into that
		//display that data here

		Employee emp= new Employee( );
		emp.id = 101;
		emp.name ="sam";
		emp.sal = 1000;
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

	}

}
