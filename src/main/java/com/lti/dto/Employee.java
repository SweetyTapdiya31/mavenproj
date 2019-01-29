package com.lti.dto;

public class Employee {
 private String Empno;
 private String Name;
 private String Salary;
 public Employee() {
	super();
}
public Employee(String empno, String name, String salary) {
	super();
	Empno = empno;
	Name = name;
	Salary = salary;
}

public String getEmpno() {
	return Empno;
}
public void setEmpno(String empno) {
	Empno = empno;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSalary() {
	return Salary;
}
public void setSalary(String salary) {
	Salary = salary;
}
 
 
}
