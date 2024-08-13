package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.Entity.Employee;

@Component
public class EmpDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void register (Employee e) {
		Object[] args =  	{e.getId(),e.getName(),e.getSal()};
		int result =  jdbcTemplate.update("insert into emp values(?,?,?)",args);
		System.out.println(result +"record Added");
		
		
	}
	
	public void updateSalary (int id, int sal ) {
		Object[] args =  	{sal,id};
		int result =  jdbcTemplate.update("update emp set sal=? where id=?",args);
		System.out.println(result +"record Updated");
		
		
	}
	public void delete  (int id  ) {
		Object[] args =  	{id};
		int result =  jdbcTemplate.update("delete from emp where id=?",args);
		System.out.println(result +"record Deleted");
		
		
	}
	

}
