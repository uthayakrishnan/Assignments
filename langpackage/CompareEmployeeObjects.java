package langpackage;

//Q55
//Create two employee objects with same data and compare two object(data)

public class CompareEmployeeObjects {
	
	public static void main(String[] args) {
		
		Employee emp1 =new Employee(100,"sam", 1000);
		Employee emp2 = new Employee(100,"sam",1000);
		System.out.println(emp1.equals(emp2));
		
	}

}
