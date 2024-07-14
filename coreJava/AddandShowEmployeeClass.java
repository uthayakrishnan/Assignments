package coreJava;

//Q4
public class AddandShowEmployeeClass {
	
public static void main(String[] args) {
	
	//here create object of Employee class and add 101,sam,1000 data into that using constructor
	//display that data here

		
	Employee emp= new Employee(101,"Sam",1000);
	System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

				
	}


}
