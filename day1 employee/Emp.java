package com.bitlabs.empjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Emp {
	public void getemp() throws SQLException{
Scanner sc=new Scanner (System.in);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Abul@123");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("Select * from emp");
	while(rs.next()) {
	System.out.println("eid is "+rs.getInt(1)+"ename is "+rs.getString(2)+"esalary is "+rs.getInt(3));
	}
}
	catch (Exception e) {
		System.out.println(e);
	}
}


}

