package com.bitlabs.empjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException {
   Scanner s=new Scanner(System.in);
    System.out.println("Enter option 1.enter details /n 2.get details 3.update details /n 4.delete details ");
    int c=s.nextInt();
    switch(c){
    case 1:
		emp1 em=new emp1();
		em.empdetails();
		break;
    case 2:
				Emp emp=new Emp();
				emp.getemp();
    case 3:
				empUpdate uemp=new empUpdate();
				uemp.update();
				break;
    case 4:
    	empUpdate uemp1=new empUpdate();
				uemp1.delete();
				break;
				
			}
}
}
		   
			
		
	


