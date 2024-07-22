package langpackage;

//Q58
//Create an employee object with some data and create a clone of it and display data from the cloned object

public class CloneEmployee{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(100,"Ram",2000);
		Employee emp1=(Employee) emp.clone();
		System.out.println(emp1.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
	}

}
