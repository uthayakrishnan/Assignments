package com.net.jdbcdriver;
import java.sql.*;


public class EmployeeJdbc {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root_1234");
		Statement st = con.createStatement();
		int insertresult = st.executeUpdate("insert into emp values (101,'ram', 2000)");
		System.out.println("Record Added"  +insertresult);
		
		int updateresult = st.executeUpdate("update emp set name='meer' where id=100");
		System.out.println("Record updated"  +updateresult);
		
		int update = st.executeUpdate("update emp set name='veer' where sal>1000");
		System.out.println("Record updated"  +update);
		
		int deleteresult = st.executeUpdate("delete from emp   where id = 101");
		System.out.println("Record Deleted"  +deleteresult);
		
		ResultSet rs = st.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println("ID"+rs.getInt("id")+"\n NAME"+rs.getString("name")+"\n SALARY"+rs.getInt("sal"));
		}
		con.close();
	}

}
