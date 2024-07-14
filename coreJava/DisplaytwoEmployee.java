package coreJava;

//Q7
public class DisplaytwoEmployee {
	
	private static void show(Employee empA, Employee empB) {
		//do required changes to show method and display that data here

		System.out.println(empA.getId()+" " + empA.getName() + " "+ empA.getSal());

		System.out.println(empB.getId()+" " + empB.getName() + " "+ empB.getSal());

	}

	public static void main(String[] args) {
		
		//here create two objects of Employee class and add  data into that
		//call show method and pass this two objects to show method
		
		Employee employeeA= new Employee(100,"Sam",1000);
		Employee employeeB= new Employee(101,"Ram",2000);
		show(employeeA,employeeB);
	}
}
