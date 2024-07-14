package coreJava;
//Q6
  public class NonStaticShowClass {
	  
	private void show(Employee emp) {
		
		//do required changes to show method and display that data here
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());

	}

	public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that
		//call show method and pass this created object to show method
		
		Employee employee= new Employee(101,"Sam",1000);
		NonStaticShowClass nonstaticshow = new NonStaticShowClass();
		nonstaticshow.show(employee);
	}

}
