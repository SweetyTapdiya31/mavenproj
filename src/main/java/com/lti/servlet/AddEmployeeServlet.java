package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.dto.Employee;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/addEmp.lti")
public class AddEmployeeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		
		Employee emp =new Employee();
		 emp.setEmpno( request.getParameter("empno"));
		 emp.setName (request.getParameter("name"));
		 emp.setSalary(request.getParameter("salary"));
		 
		 dao.add(emp);
		
		 HttpSession session = request.getSession();
		 
		 session.setAttribute("message", "Record added!!");
		 
		response.sendRedirect("addEmployee.jsp");
		
	
	
		
	}

}
