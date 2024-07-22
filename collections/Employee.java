package collections;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	  int id;
	  String name;
	  int sal;

	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return Integer.compare(this.id, o.getId());
	}
	@Override
	public String toString() {
		return this.id + "\n"+ this.name+ "\n" + this.sal;
		
	}

	
	  @Override public boolean equals(Object obj) { 
		  Employee emp = (Employee)obj;
	  
		 return this.id==emp.getId()&& 
		this.name.equals(emp.getName())&&
		this.sal==emp.getSal();
	  
	  }
	 
	@Override
    public int hashCode() {
        return Objects.hash(id,name, sal);
    }
	 
}