package com.lti.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.lti.dto.Employee;



public class EmployeeDao {


 public void add(Employee emp ) throws IOException {
	 Connection con =null;
	 PreparedStatement ps=null;
 
		 try
		 {
		 
			 InputStream is = 
					 this.getClass().getClassLoader().getResourceAsStream("dev-db.properties");
			 
			    Properties dbProps = new Properties();
			    dbProps.load(is);
			    String driverClassName = dbProps.getProperty("driverClassName");
			 	String url = dbProps.getProperty("url");
				String user = dbProps.getProperty("username");
				String pass = dbProps.getProperty("password");
				
				
				Class.forName(driverClassName); 
				con = DriverManager.getConnection(url, user, pass);
				String Sql = (" insert into Add_Emp values(?,?,?)") ;
						ps=con.prepareStatement(Sql);
						ps.setString(1, emp.getEmpno());
						ps.setString(2, emp.getName());
						ps.setString(3, emp. getSalary());		
						
						ps.executeUpdate();
				        
						System.out.println("Data inserted");
		 
		try {
			 ps.close();
		}catch(Exception e) {}
		try {
			con.close();
			}catch(Exception e) {}
		 }catch (ClassNotFoundException | SQLException | IOException e ) {
				e.printStackTrace();
		 }  
		}					
}
	 


