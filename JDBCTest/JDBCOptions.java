package com.net.jdbcdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOptions {
	 
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root_1234");
		Statement st = con.createStatement();
		
		 int option=0;
		do  {
		System.out.println("Enter any of the option to continue\n 1.Insert\n 2.Update\n 3.Show\n 4.Delete\n 5.Exit");

		Scanner input = new Scanner(System.in);
		  option = input.nextInt();
		switch (option) {

		case 1:
			System.out.println("Enter the emp id ");
			int id = input.nextInt();
			input.nextLine();
			System.out.println("Enter the emp name ");
			String name = input.nextLine();
			//input.nextLine();
			 
			System.out.println("Enter the emp sal ");
			int sal = input.nextInt();
			int insertresult = st
					.executeUpdate("insert into emp values ( " + id + ", '" + name+ "' , " + sal + " )");
			System.out.println("Record Added" + insertresult);
			break;

		case 2:
			System.out.println("Enter the emp id to update ");
			int empid = input.nextInt();
			input.nextLine();
			System.out.println("Enter the emp name ");
			String empname = input.nextLine();
			
			System.out.println("Enter the emp sal ");
			int empsal = input.nextInt();
			int updateresult = st.executeUpdate(
					"update  emp set name= '" + empname + "' , sal ="+ empsal +" where id= "+ empid +" ");
			System.out.println("Record Updated" + updateresult);
			break;

		case 4:
			System.out.println("Enter the emp id to Delete");
			int eid = input.nextInt();

			int deleteresult = st.executeUpdate("delete from emp where id= " + eid + " ");
			System.out.println("Record Deleted" + deleteresult);
			break;

		case 3:

			ResultSet rs = st.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(
						"ID" + rs.getInt("id") + "\n NAME" + rs.getString("name") + "\n SALARY" + rs.getInt("sal"));
			}
			break;
			
		case 5:
				System.out.println("Please enter the given option");
				return;

		}
		
		
		}while(option<5);
		
		con.close();
	}

}
