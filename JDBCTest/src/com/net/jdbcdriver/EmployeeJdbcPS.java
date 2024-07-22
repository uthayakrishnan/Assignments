package com.net.jdbcdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 

public class EmployeeJdbcPS {
	
	public static void main(String[] args) throws  Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root_1234");
	 
	
	  PreparedStatement insertSt = con.prepareStatement( "insert into emp values (?, ?, ?) ");
	  insertSt.setInt(1, 101);
	  insertSt.setInt(3, 5000); 
	  insertSt.setString(2,"mike"); 
	  int IsInsert = insertSt.executeUpdate(); System.out.println("Record Added" +IsInsert);
	 
	
	PreparedStatement updateSt = con.prepareStatement( "update emp set name=? , sal =? where id=?" );
	updateSt.setString(1, "thor");
	updateSt.setInt(2, 500);
	updateSt.setInt(3, 100);
	  
	int IsUpdate =  updateSt.executeUpdate();
	System.out.println("Record updated"  +IsUpdate);
	
	PreparedStatement deleteSt = con.prepareStatement( "delete from emp   where id = ?");
 
	deleteSt.setInt(1, 101);
	  
	int IsDelete =  deleteSt.executeUpdate();
	System.out.println("Record Deleted"  +IsDelete);
	
	PreparedStatement SelectSt = con.prepareStatement( "select * from emp");
	
	ResultSet rs = SelectSt.executeQuery( );
	while(rs.next()) {
		System.out.println("ID"+rs.getInt("id")+"\n NAME"+rs.getString("name")+"\n SALARY"+rs.getInt("sal"));
	}
	con.close();
}
}

