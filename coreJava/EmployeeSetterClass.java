package coreJava;
//Q3
public class EmployeeSetterClass {
	
	public static void main(String[] args) {
		
		//here create object of Employee class and add 101,sam,1000 data into that using setter method
		//display that data here

		Employee emp= new Employee();
		emp.setId(101);
		emp.setName("Sam");
		emp.setSal(1000);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

				
	}

}
