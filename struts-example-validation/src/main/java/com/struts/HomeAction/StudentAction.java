package com.struts.HomeAction;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

@ResultPath(value = "/WEB-INF/content/studsucess.jsp")
@Action(value = "/studregister", results= {
		@Result(name = "success", location = "studsuccess.jsp")
})
public class StudentAction extends ActionSupport{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private List<String> hobbies;
	public Student getStudent() {
		return student;
	}
	@Override
	public String toString() {
		return "StudentAction [student=" + student + ", hobbies=" + hobbies + "]";
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
@Override
public String execute() throws Exception {
	if(student.getName().equals("manjunath"))
		return SUCCESS;
	return ERROR;
}

@Override
public void validate() {
	if(student!=null) {
		if(student.getName().length() <= 0)
			addFieldError("student.name","name is required");
		if(student.getAge()<20.length() <= 0)
			addFieldError("student.name","name is required");
		
	}









}
