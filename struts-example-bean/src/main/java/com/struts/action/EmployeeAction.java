package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction  extends ActionSupport {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String execute() {
		System.out.println(employee);
		System.out.println(employee.getEmpName());
		if(employee.getEmpName().equals("Man"))
			return "success";
		else if (employee.getEmpName().equals("A"))
			throw new NullPointerException();
		else
		return "error";
	}
}
