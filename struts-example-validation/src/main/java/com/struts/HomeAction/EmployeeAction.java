package com.struts.HomeAction;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

@ResultPath(value ="/WEB-INF/content/")
@Namespace("/")
public class EmployeeAction extends  ActionSupport {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

private Employee employee;

@Override
public String toString() {
	return "EmployeeAction [employee=" + employee + "]";
}
}