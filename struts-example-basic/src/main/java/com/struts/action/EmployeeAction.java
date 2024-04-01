package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

public class EmployeeAction {
	@Namespace("/")
	@ResultPath(value="/WEB-INF/content/")
	@Action(value="login",
	results = {
			@Result(name="success",location="/welcome.jsp"),
			@Result(name="error",location="/index.jsp"),
	@Override
	public String toString() {
		return "EmployeeAction [employeeName=" + employeeName + "]";
	}
	private String employeeName;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return getEmployeeId();
	}
	public void setEmployeeId(int employeeId) {
	}
	public String excute() {
		if(employeeName.equalsIgnoreCase("Manjunath"))
		return employeeName;
		return employeeName;
	}
}


