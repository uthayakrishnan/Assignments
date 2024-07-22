package langpackage;

//Q57.
//Create two employee objects and compare it’s references using == and equals

public class CompareEmpReference {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(100,"sam",1000 );
		Employee emp2 = new Employee(100,"sam",1000 );
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		
	}

}
