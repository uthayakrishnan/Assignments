package coreJava;

  class EmployeeDisplay{
	public static void main(String[] args) {
		//Q10
	//create Employee object with 101,sam,1000 data
	//display this object data by passing to show method
	//add 100 bonus in salary 
	//display this object data by passing to show method
		
	Employee emp = new Employee(101,"Sam",1000);
	EmployeeDisplay empDisplay = new EmployeeDisplay();
	empDisplay.show(emp);
	emp.sal = emp.sal+100;
	empDisplay.show(emp);
	}
	public void show(Employee emp){
			//do required changes in show method
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
		}

	
	
}
