package com.nt.Entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id;
	private String Name;
	private int sal;
	
	public int getId() {
		return id;
	}
	public Employee() {}
	public Employee(int id,String name, int sal) {
		
		this.id=id;
		this.Name = name;
		this.sal = sal;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
