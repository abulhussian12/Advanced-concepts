package com.bitlabs.empjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class empUpdate {
	Scanner sc =new Scanner (System.in);
public void update() {

System.out.println("Enter id to update");
int id=sc.nextInt();
sc.nextLine();
System.out.println("enter name ");
String ename=sc.nextLine();
System.out.println("Enter salary");
int esalary=sc.nextInt();
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Abul@123");
	PreparedStatement pst=con.prepareStatement("update emp set ename=?,esalary =?where eid=?");
	pst.setString(1, ename);
	pst.setInt(2, esalary);
	pst.setInt(3, id);
int j=pst.executeUpdate();
	
if (j>0) {
	System.out.println("Upadted sucssfully");
}
else {
	System.out.println("Error occured while updating the data");
}
}

catch (Exception e) {
	System.out.println(e);
}
}
public void delete() {
	System.out.println("Enter id to delete");
	int id=sc.nextInt();
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Abul@123");
	PreparedStatement ps1=con.prepareStatement("delete from emp where eid=?");
	ps1.setInt(1,id);
	int j=ps1.executeUpdate();
	if (j>0) {
		System.out.println("Deleted sccessfully");
	}
	else {
		System.out.println("error while deleting the data");
	}
}
catch(Exception e) {
	System.out.println(e);
}
}
}
