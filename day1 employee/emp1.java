package com.bitlabs.empjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class emp1 {
	int eid,esalary;
	String ename;

	Scanner sc=new Scanner (System.in);
	
	public void empdetails() {
	System.out.println("Enter eid");
	eid=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter ename");
	ename=sc.nextLine();
	System.out.println("Enter salary ");
	esalary=sc.nextInt();

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Abul@123");
		if(con==null) {
			System.out.println("Database is not connected");
		}
		else {
			System.out.println("Connection established succesfully");
		}
		PreparedStatement ps=con.prepareStatement("insert into emp values (?,?,?)");
		ps.setInt(1,eid);
		ps.setString(2, ename);
		ps.setInt(3, esalary);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Inserted succesfully");
		}
		else {
			System.out.println("error occur while insering values!!!!!");
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
